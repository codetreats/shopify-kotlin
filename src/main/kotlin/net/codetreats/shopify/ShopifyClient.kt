package net.codetreats.shopify

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.adapters.EnumJsonAdapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import net.codetreats.rest.RestClient
import net.codetreats.shopify.model.FinancialStatus
import net.codetreats.shopify.util.*
import org.apache.logging.log4j.Logger
import kotlin.math.min

const val MAX_PAGE_SIZE = 250

class ShopifyClient(
    apiUrl: String,
    accessToken: String,
    val logger: Logger? = null,
) {
    val restClient = RestClient(
        apiUrl,
        mapOf("X-Shopify-Access-Token" to accessToken),
    )

    val moshi: Moshi = Moshi.Builder()
        .add(JsonStringDoubleAdapter())
        .add(JsonStringIntAdapter())
        .add(JsonStringLongAdapter())
        .addLast(KotlinJsonAdapterFactory())
        .add(LocalDateTimeAdapter())
        .add(
            FinancialStatus::class.java,
            EnumJsonAdapter.create(FinancialStatus::class.java).withUnknownFallback(FinancialStatus.UNKNOWN),
        )
        .build()

    inline fun <reified T> getElement(
        resourceKey: String,
        subUrl: String,
        params: Map<String, String> = emptyMap(),
        headers: Map<String, String> = emptyMap(),
    ): T {
        logger?.info("GET $subUrl${params.asUrl()} (${headers.asList()})")
        val message = restClient.get(subUrl, params, headers).message
        logger?.debug("Message: $message")

        // Create adapter for the wrapper map
        val mapType = Types.newParameterizedType(
            Map::class.java,
            String::class.java,
            T::class.java,
        )
        val adapter: JsonAdapter<Map<String, T>> = moshi.adapter(mapType)
        val map = adapter.fromJson(message) ?: throw IllegalStateException("Failed to parse response")

        return map[resourceKey] ?: throw IllegalStateException("Resource key '$resourceKey' not found in response")
    }

    inline fun <reified T> get(
        resourceKey: String,
        subUrl: String,
        params: Map<String, String?> = emptyMap(),
        headers: Map<String, String> = emptyMap(),
    ): ShopifyListResponse<T> {
        val requestedLimit = params["limit"]?.toIntOrNull()
        val pageSize = requestedLimit?.let { min(requestedLimit, MAX_PAGE_SIZE) } ?: MAX_PAGE_SIZE

        val initialParams = params.toMutableMap()
        initialParams["limit"] = pageSize.toString()

        var currentUrl = subUrl
        var currentParams = initialParams.filterNotNull()
        val allResults = mutableListOf<T>()

        while (true) {
            logger?.info("GET $currentUrl${currentParams.asUrl()} (${headers.asList()})")
            val response = restClient.get(currentUrl, currentParams, headers)
            val message = response.message
            logger?.debug("Message: $message")

            // Use Map adapter to unwrap the root key
            val listType = Types.newParameterizedType(List::class.java, T::class.java)
            val responseType = Types.newParameterizedType(Map::class.java, String::class.java, listType)
            val adapter: JsonAdapter<Map<String, List<T>>> = moshi.adapter(responseType)

            val map = adapter.fromJson(message) ?: emptyMap()
            val results = map[resourceKey] ?: emptyList()
            allResults.addAll(results)

            if (requestedLimit != null && allResults.size >= requestedLimit) {
                break
            }

            // Check for next link
            val linkHeader = response.headers["Link"]?.firstOrNull() ?: response.headers["link"]?.firstOrNull()
            val nextLink = linkHeader?.let { header ->
                val links = header.split(",")
                val next = links.find { it.contains("rel=\"next\"") }
                next?.let {
                    val startIndex = it.indexOf("<") + 1
                    val endIndex = it.indexOf(">")
                    if (startIndex > 0 && endIndex > startIndex) {
                        it.substring(startIndex, endIndex)
                    } else {
                        null
                    }
                }
            } ?: break

            // Prepare next request
            check(nextLink.startsWith(restClient.baseUrl)) { "Next link does not start with base URL: $nextLink" }
            currentUrl = nextLink.removePrefix(restClient.baseUrl)
            currentParams = emptyMap()
        }

        val finalResults = if (requestedLimit != null) allResults.take(requestedLimit) else allResults
        return ShopifyListResponse(finalResults)
    }
}

fun Map<String, String>.asUrl() = entries.joinToString("&", prefix = "?") { (k, v) -> "$k=$v" }

fun Map<String, String>.asList() = entries.joinToString(",") { (k, v) -> "$k=$v" }

fun Map<String, String?>.filterNotNull(): Map<String, String> =
    filter { it.value != null }.map { it.key to it.value!! }.toMap()

data class ShopifyListResponse<T>(val results: List<T>)

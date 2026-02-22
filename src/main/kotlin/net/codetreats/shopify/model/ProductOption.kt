package net.codetreats.shopify.model

import com.squareup.moshi.Json

data class ProductOption(
    @Json(name = "id") val id: Long,
    @Json(name = "product_id") val productId: Long,
    @Json(name = "name") val name: String,
    @Json(name = "position") val position: Int,
    @Json(name = "values") val values: List<String>,
)

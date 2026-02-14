package net.codetreats.shopify.model

import com.squareup.moshi.Json
import java.time.LocalDateTime

data class Product(
    @Json(name = "id")
    val id: Long,
    @Json(name = "title")
    val title: String,
    @Json(name = "body_html")
    val bodyHtml: String?,
    @Json(name = "vendor")
    val vendor: String?,
    @Json(name = "product_type")
    val productType: String?,
    @Json(name = "created_at")
    val createdAt: LocalDateTime?,
    @Json(name = "handle")
    val handle: String?,
    @Json(name = "updated_at")
    val updatedAt: LocalDateTime?,
    @Json(name = "published_at")
    val publishedAt: LocalDateTime?,
    @Json(name = "template_suffix")
    val templateSuffix: String?,
    @Json(name = "status")
    val status: String?,
    @Json(name = "published_scope")
    val publishedScope: String?,
    @Json(name = "tags")
    val tags: String?,
    @Json(name = "admin_graphql_api_id")
    val adminGraphqlApiId: String?,
    @Json(name = "variants")
    val variants: List<Any>?,
    @Json(name = "options")
    val options: List<Any>?,
    @Json(name = "images")
    val images: List<Any>?,
    @Json(name = "image")
    val image: Any?
)

package net.codetreats.shopify.model

import com.squareup.moshi.Json
import java.time.LocalDateTime

data class ProductImage(
    @Json(name = "id") val id: Long,
    @Json(name = "product_id") val productId: Long?,
    @Json(name = "position") val position: Int?,
    @Json(name = "created_at") val createdAt: LocalDateTime?,
    @Json(name = "updated_at") val updatedAt: LocalDateTime?,
    @Json(name = "alt") val alt: String?,
    @Json(name = "width") val width: Int?,
    @Json(name = "height") val height: Int?,
    @Json(name = "src") val src: String?,
    @Json(name = "variant_ids") val variantIds: List<Long>?,
)

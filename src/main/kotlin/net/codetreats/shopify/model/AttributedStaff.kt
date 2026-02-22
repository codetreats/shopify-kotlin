package net.codetreats.shopify.model

import com.squareup.moshi.Json

data class AttributedStaff(
    @Json(name = "id") val id: String,
    @Json(name = "quantity") val quantity: Int,
)

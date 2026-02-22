package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class DiscountCode(
    @Json(name = "code") val code: String,
    @Json(name = "amount") @JsonString val amount: Double,
    @Json(name = "type") val type: String,
)

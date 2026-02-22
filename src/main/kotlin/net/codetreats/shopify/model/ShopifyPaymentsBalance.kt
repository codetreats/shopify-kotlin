package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class ShopifyPaymentsBalance(
    @Json(name = "currency") val currency: String,
    @Json(name = "amount") @JsonString val amount: Double,
)

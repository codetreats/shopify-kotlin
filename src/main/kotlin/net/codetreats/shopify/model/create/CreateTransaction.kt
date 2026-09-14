package net.codetreats.shopify.model.create

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class CreateTransaction(
        @Json(name = "currency") val currency: String = "EUR",
        @Json(name = "kind") val kind: String = "capture",
        @Json(name = "gateway") val gateway: String,
        @Json(name = "amount") @JsonString val amount: Double,
)

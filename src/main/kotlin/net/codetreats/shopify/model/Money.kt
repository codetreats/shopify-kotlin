package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class Money(
    @Json(name = "amount")
    @JsonString
    val amount: Double?,
    @Json(name = "currency_code")
    val currencyCode: String
)

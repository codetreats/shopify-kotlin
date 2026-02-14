package net.codetreats.shopify.model

import com.squareup.moshi.Json

data class Tip(
    @Json(name = "payment_method")
    val paymentMethod: String?,
    @Json(name = "payment_gateway")
    val paymentGateway: String?
)

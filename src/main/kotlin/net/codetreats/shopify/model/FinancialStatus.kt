package net.codetreats.shopify.model

import com.squareup.moshi.Json

enum class FinancialStatus {
    @Json(name = "pending")
    PENDING,

    @Json(name = "authorized")
    AUTHORIZED,

    @Json(name = "partially_paid")
    PARTIALLY_PAID,

    @Json(name = "paid")
    PAID,

    @Json(name = "partially_refunded")
    PARTIALLY_REFUNDED,

    @Json(name = "refunded")
    REFUNDED,

    @Json(name = "voided")
    VOIDED,

    @Json(name = "any")
    ANY,

    @Json(name = "unpaid")
    UNPAID,

    // Fallback
    @Json(name = "unknown")
    UNKNOWN,
}

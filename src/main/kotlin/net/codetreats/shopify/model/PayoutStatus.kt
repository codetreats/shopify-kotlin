package net.codetreats.shopify.model

import com.squareup.moshi.Json

enum class PayoutStatus {
    @Json(name = "scheduled")
    SCHEDULED,

    @Json(name = "in_transit")
    IN_TRANSIT,

    @Json(name = "paid")
    PAID,

    @Json(name = "failed")
    FAILED,

    @Json(name = "canceled")
    CANCELED,

    @Json(name = "pending")
    PENDING,
}

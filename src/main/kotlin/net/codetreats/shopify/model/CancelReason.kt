package net.codetreats.shopify.model

import com.squareup.moshi.Json

enum class CancelReason {
    @Json(name = "customer")
    CUSTOMER,

    @Json(name = "fraud")
    FRAUD,

    @Json(name = "inventory")
    INVENTORY,

    @Json(name = "declined")
    DECLINED,

    @Json(name = "other")
    OTHER,

    // Fallback
    @Json(name = "unknown")
    UNKNOWN,
}

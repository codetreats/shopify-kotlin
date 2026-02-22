package net.codetreats.shopify.model

import com.squareup.moshi.Json

enum class FulfillmentStatus {
    @Json(name = "fulfilled")
    FULFILLED,

    @Json(name = "partial")
    PARTIAL,

    @Json(name = "restocked")
    RESTOCKED,

    @Json(name = "shipped")
    SHIPPED,

    @Json(name = "unshipped")
    UNSHIPPED,

    @Json(name = "any")
    ANY,

    @Json(name = "not_eligible")
    NOT_ELIGIBLE,

    // Fallback
    @Json(name = "unknown")
    UNKNOWN,
}

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
    
    // Fallback
    @Json(name = "unknown")
    UNKNOWN
}

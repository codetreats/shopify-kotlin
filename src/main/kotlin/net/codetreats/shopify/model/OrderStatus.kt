package net.codetreats.shopify.model

import com.squareup.moshi.Json

enum class OrderStatus {
    @Json(name = "open")
    OPEN,
    @Json(name = "closed")
    CLOSED,
    @Json(name = "cancelled")
    CANCELLED,
    @Json(name = "any")
    ANY,
    
    // Fallback
    @Json(name = "unknown")
    UNKNOWN
}

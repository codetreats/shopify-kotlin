package net.codetreats.shopify.model

import com.squareup.moshi.Json

enum class ProcessingMethod {
    @Json(name = "direct")
    DIRECT,

    @Json(name = "manual")
    MANUAL,

    @Json(name = "offsite")
    OFFSITE,

    @Json(name = "express")
    EXPRESS,

    // Fallback
    @Json(name = "unknown")
    UNKNOWN,
}

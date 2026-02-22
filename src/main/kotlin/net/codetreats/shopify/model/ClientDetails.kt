package net.codetreats.shopify.model

import com.squareup.moshi.Json

data class ClientDetails(
    @Json(name = "accept_language")
    val acceptLanguage: String?,
    @Json(name = "browser_height")
    val browserHeight: Int?,
    @Json(name = "browser_ip")
    val browserIp: String?,
    @Json(name = "browser_width")
    val browserWidth: Int?,
    @Json(name = "session_hash")
    val sessionHash: String?,
    @Json(name = "user_agent")
    val userAgent: String?,
)

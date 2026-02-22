package net.codetreats.shopify.model

import com.squareup.moshi.Json
import java.time.LocalDateTime

data class EmailMarketingConsent(
    @Json(name = "state")
    val state: String?,
    @Json(name = "opt_in_level")
    val optInLevel: String?,
    @Json(name = "consent_updated_at")
    val consentUpdatedAt: LocalDateTime?,
)

package net.codetreats.shopify.model

import com.squareup.moshi.Json
import java.time.LocalDateTime

data class SmsMarketingConsent(
    @Json(name = "state") val state: String?,
    @Json(name = "opt_in_level") val optInLevel: String?,
    @Json(name = "consent_updated_at") val consentUpdatedAt: LocalDateTime?,
    @Json(name = "consent_collected_from") val consentCollectedFrom: String?,
)

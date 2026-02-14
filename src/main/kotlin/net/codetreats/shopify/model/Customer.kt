package net.codetreats.shopify.model

import com.squareup.moshi.Json
import java.time.LocalDateTime

data class Customer(
    @Json(name = "id")
    val id: Long,
    @Json(name = "created_at")
    val createdAt: LocalDateTime?,
    @Json(name = "updated_at")
    val updatedAt: LocalDateTime?,
    @Json(name = "first_name")
    val firstName: String?,
    @Json(name = "last_name")
    val lastName: String?,
    @Json(name = "email")
    val email: String?,
    @Json(name = "phone")
    val phone: String?,
    @Json(name = "state")
    val state: String?,
    @Json(name = "note")
    val note: String?,
    @Json(name = "verified_email")
    val verifiedEmail: Boolean,
    @Json(name = "multipass_identifier")
    val multipassIdentifier: String?,
    @Json(name = "tax_exempt")
    val taxExempt: Boolean,
    @Json(name = "email_marketing_consent")
    val emailMarketingConsent: EmailMarketingConsent?,
    @Json(name = "sms_marketing_consent")
    val smsMarketingConsent: Any?,
    @Json(name = "tags")
    val tags: String?,
    @Json(name = "currency")
    val currency: String?,
    @Json(name = "tax_exemptions")
    val taxExemptions: List<String>?,
    @Json(name = "admin_graphql_api_id")
    val adminGraphqlApiId: String?,
    @Json(name = "default_address")
    val defaultAddress: Address?
)

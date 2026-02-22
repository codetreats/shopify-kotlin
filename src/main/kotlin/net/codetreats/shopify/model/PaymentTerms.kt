package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class PaymentTerms(
    @Json(name = "amount") @JsonString val amount: Double?,
    @Json(name = "currency") val currency: String?,
    @Json(name = "payment_terms_name") val paymentTermsName: String?,
    @Json(name = "payment_terms_type") val paymentTermsType: String?,
    @Json(name = "due_in_days") val dueInDays: Int?,
    @Json(name = "payment_schedules") val paymentSchedules: List<Any>?,
)

package net.codetreats.shopify.model

import com.squareup.moshi.Json

data class PaymentDetails(
    @Json(name = "credit_card_bin") val creditCardBin: String?,
    @Json(name = "avs_result_code") val avsResultCode: String?,
    @Json(name = "cvv_result_code") val cvvResultCode: String?,
    @Json(name = "credit_card_number") val creditCardNumber: String?,
    @Json(name = "credit_card_company") val creditCardCompany: String?,
)

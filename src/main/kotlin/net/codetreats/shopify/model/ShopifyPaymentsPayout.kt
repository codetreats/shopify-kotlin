package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString
import java.time.LocalDateTime

data class ShopifyPaymentsPayout(
    @Json(name = "id") val id: Long,
    @Json(name = "status") val status: PayoutStatus,
    @Json(name = "date") val date: LocalDateTime?,
    @Json(name = "currency") val currency: String,
    @Json(name = "amount") @JsonString val amount: Double,
    @Json(name = "summary") val summary: ShopifyPaymentsPayoutSummary?,
)

data class ShopifyPaymentsPayoutSummary(
    @Json(name = "adjustments_fee_amount") @JsonString val adjustmentsFeeAmount: Double?,
    @Json(name = "adjustments_gross_amount") @JsonString val adjustmentsGrossAmount: Double?,
    @Json(name = "charges_fee_amount") @JsonString val chargesFeeAmount: Double?,
    @Json(name = "charges_gross_amount") @JsonString val chargesGrossAmount: Double?,
    @Json(name = "refunds_fee_amount") @JsonString val refundsFeeAmount: Double?,
    @Json(name = "refunds_gross_amount") @JsonString val refundsGrossAmount: Double?,
    @Json(name = "reserved_funds_fee_amount") @JsonString val reservedFundsFeeAmount: Double?,
    @Json(name = "reserved_funds_gross_amount")
    @JsonString
    val reservedFundsGrossAmount: Double?,
    @Json(name = "retried_payouts_fee_amount") @JsonString val retriedPayoutsFeeAmount: Double?,
    @Json(name = "retried_payouts_gross_amount")
    @JsonString
    val retriedPayoutsGrossAmount: Double?,
)

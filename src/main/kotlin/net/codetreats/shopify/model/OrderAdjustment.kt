package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class OrderAdjustment(
    @Json(name = "id") val id: Long,
    @Json(name = "order_id") val orderId: Long,
    @Json(name = "refund_id") val refundId: Long?,
    @Json(name = "amount") @JsonString val amount: Double?,
    @Json(name = "tax_amount") @JsonString val taxAmount: Double?,
    @Json(name = "kind") val kind: String?,
    @Json(name = "reason") val reason: String?,
    @Json(name = "amount_set") val amountSet: MoneySet?,
    @Json(name = "tax_amount_set") val taxAmountSet: MoneySet?,
)

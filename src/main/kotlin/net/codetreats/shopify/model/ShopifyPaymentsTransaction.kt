package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString
import java.time.LocalDateTime

data class ShopifyPaymentsTransaction(
    @Json(name = "id") val id: String,
    @Json(name = "type") val type: String,
    @Json(name = "test") val test: Boolean,
    @Json(name = "payout_id") val payoutId: Long?,
    @Json(name = "payout_status") val payoutStatus: PayoutStatus?,
    @Json(name = "currency") val currency: String,
    @Json(name = "amount") @JsonString val amount: Double,
    @Json(name = "fee") @JsonString val fee: Double,
    @Json(name = "net") @JsonString val net: Double,
    @Json(name = "source_id") val sourceId: Long?,
    @Json(name = "source_type") val sourceType: String?,
    @Json(name = "source_order_transaction_id") val sourceOrderTransactionId: Long?,
    @Json(name = "source_order_id") val sourceOrderId: Long?,
    @Json(name = "processed_at") val processedAt: LocalDateTime?,
)

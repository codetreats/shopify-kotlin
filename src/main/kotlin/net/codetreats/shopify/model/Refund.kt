package net.codetreats.shopify.model

import com.squareup.moshi.Json
import java.time.LocalDateTime

data class Refund(
    @Json(name = "id") val id: Long,
    @Json(name = "order_id") val orderId: Long,
    @Json(name = "created_at") val createdAt: LocalDateTime?,
    @Json(name = "note") val note: String?,
    @Json(name = "user_id") val userId: Long?,
    @Json(name = "processed_at") val processedAt: LocalDateTime?,
    @Json(name = "refund_line_items") val refundLineItems: List<RefundLineItem>?,
    @Json(name = "transactions") val transactions: List<Transaction>?,
    @Json(name = "order_adjustments") val orderAdjustments: List<OrderAdjustment>?,
)

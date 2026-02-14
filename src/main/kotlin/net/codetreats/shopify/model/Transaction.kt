package net.codetreats.shopify.model

import com.squareup.moshi.Json
import java.time.LocalDateTime

data class Transaction(
    @Json(name = "id")
    val id: Long,
    @Json(name = "order_id")
    val orderId: Long?,
    @Json(name = "kind")
    val kind: String?,
    @Json(name = "gateway")
    val gateway: String?,
    @Json(name = "status")
    val status: String?,
    @Json(name = "message")
    val message: String?,
    @Json(name = "created_at")
    val createdAt: LocalDateTime?,
    @Json(name = "test")
    val test: Boolean,
    @Json(name = "authorization")
    val authorization: String?,
    @Json(name = "location_id")
    val locationId: Long?,
    @Json(name = "user_id")
    val userId: Long?,
    @Json(name = "parent_id")
    val parentId: Long?,
    @Json(name = "processed_at")
    val processedAt: LocalDateTime?,
    @Json(name = "device_id")
    val deviceId: Long?,
    @Json(name = "error_code")
    val errorCode: String?,
    @Json(name = "source_name")
    val sourceName: String?,
    @Json(name = "payment_details")
    val paymentDetails: Any?,
    @Json(name = "receipt")
    val receipt: Any?,
    @Json(name = "amount")
    val amount: String?,
    @Json(name = "currency")
    val currency: String?,
    @Json(name = "admin_graphql_api_id")
    val adminGraphqlApiId: String?
)

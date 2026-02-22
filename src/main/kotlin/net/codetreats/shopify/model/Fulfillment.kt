package net.codetreats.shopify.model

import com.squareup.moshi.Json
import java.time.LocalDateTime

data class Fulfillment(
    @Json(name = "id") val id: Long,
    @Json(name = "order_id") val orderId: Long?,
    @Json(name = "status") val status: String?,
    @Json(name = "created_at") val createdAt: LocalDateTime?,
    @Json(name = "service") val service: String?,
    @Json(name = "updated_at") val updatedAt: LocalDateTime?,
    @Json(name = "tracking_company") val trackingCompany: String?,
    @Json(name = "shipment_status") val shipmentStatus: String?,
    @Json(name = "location_id") val locationId: Long?,
    @Json(name = "tracking_number") val trackingNumber: String?,
    @Json(name = "tracking_numbers") val trackingNumbers: List<String>?,
    @Json(name = "tracking_url") val trackingUrl: String?,
    @Json(name = "tracking_urls") val trackingUrls: List<String>?,
    @Json(name = "receipt") val receipt: Any?,
    @Json(name = "name") val name: String?,
    @Json(name = "line_items") val lineItems: List<LineItem>?,
)

package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class RefundLineItem(
    @Json(name = "id") val id: Long,
    @Json(name = "quantity") val quantity: Int,
    @Json(name = "line_item_id") val lineItemId: Long,
    @Json(name = "location_id") val locationId: Long?,
    @Json(name = "restock_type") val restockType: String?,
    @Json(name = "subtotal") @JsonString val subtotal: Double?,
    @Json(name = "total_tax") @JsonString val totalTax: Double?,
    @Json(name = "subtotal_set") val subtotalSet: MoneySet?,
    @Json(name = "total_tax_set") val totalTaxSet: MoneySet?,
    @Json(name = "line_item") val lineItem: LineItem?,
)

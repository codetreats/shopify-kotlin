package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString
import java.time.LocalDateTime

data class ProductVariant(
    @Json(name = "id") val id: Long,
    @Json(name = "product_id") val productId: Long,
    @Json(name = "title") val title: String,
    @Json(name = "price") @JsonString val price: Double,
    @Json(name = "sku") val sku: String?,
    @Json(name = "position") val position: Int,
    @Json(name = "inventory_policy") val inventoryPolicy: String,
    @Json(name = "compare_at_price") @JsonString val compareAtPrice: Double?,
    @Json(name = "fulfillment_service") val fulfillmentService: String?,
    @Json(name = "inventory_management") val inventoryManagement: String?,
    @Json(name = "option1") val option1: String?,
    @Json(name = "option2") val option2: String?,
    @Json(name = "option3") val option3: String?,
    @Json(name = "created_at") val createdAt: LocalDateTime?,
    @Json(name = "updated_at") val updatedAt: LocalDateTime?,
    @Json(name = "taxable") val taxable: Boolean,
    @Json(name = "barcode") val barcode: String?,
    @Json(name = "grams") val grams: Int,
    @Json(name = "image_id") val imageId: Long?,
    @Json(name = "weight") val weight: Double,
    @Json(name = "weight_unit") val weightUnit: String,
    @Json(name = "inventory_item_id") val inventoryItemId: Long?,
    @Json(name = "inventory_quantity") val inventoryQuantity: Int,
    @Json(name = "old_inventory_quantity") val oldInventoryQuantity: Int?,
    @Json(name = "requires_shipping") val requiresShipping: Boolean,
    @Json(name = "admin_graphql_api_id") val adminGraphqlApiId: String?,
)

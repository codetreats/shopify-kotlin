package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class LineItem(
    @Json(name = "id") val id: Long,
    @Json(name = "admin_graphql_api_id") val adminGraphqlApiId: String?,
    @Json(name = "attributed_staffs") val attributedStaffs: List<AttributedStaff>?,
    @Json(name = "current_quantity") val currentQuantity: Int,
    @Json(name = "fulfillable_quantity") val fulfillableQuantity: Int,
    @Json(name = "fulfillment_service") val fulfillmentService: String?,
    @Json(name = "fulfillment_status") val fulfillmentStatus: FulfillmentStatus?,
    @Json(name = "gift_card") val giftCard: Boolean,
    @Json(name = "grams") val grams: Int,
    @Json(name = "name") val name: String?,
    @Json(name = "price") @JsonString val price: Double?,
    @Json(name = "price_set") val priceSet: MoneySet?,
    @Json(name = "product_exists") val productExists: Boolean,
    @Json(name = "product_id") val productId: Long?,
    @Json(name = "properties") val properties: List<NoteAttribute>?,
    @Json(name = "quantity") val quantity: Int,
    @Json(name = "requires_shipping") val requiresShipping: Boolean,
    @Json(name = "sku") val sku: String?,
    @Json(name = "taxable") val taxable: Boolean,
    @Json(name = "title") val title: String?,
    @Json(name = "total_discount") @JsonString val totalDiscount: Double?,
    @Json(name = "total_discount_set") val totalDiscountSet: MoneySet?,
    @Json(name = "variant_id") val variantId: Long?,
    @Json(name = "variant_inventory_management") val variantInventoryManagement: String?,
    @Json(name = "variant_title") val variantTitle: String?,
    @Json(name = "vendor") val vendor: String?,
    @Json(name = "tax_lines") val taxLines: List<TaxLine>?,
    @Json(name = "duties") val duties: List<Duty>?,
    @Json(name = "discount_allocations") val discountAllocations: List<DiscountAllocation>?,
    @Json(name = "tip") val tip: Tip?,
    @Json(name = "tip_payment_gateway") val tipPaymentGateway: String?,
    @Json(name = "tip_payment_method") val tipPaymentMethod: String?,
)

package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class ShippingLine(
    @Json(name = "id")
    val id: Long,
    @Json(name = "carrier_identifier")
    val carrierIdentifier: String?,
    @Json(name = "code")
    val code: String?,
    @Json(name = "discounted_price")
    @JsonString
    val discountedPrice: Double?,
    @Json(name = "discounted_price_set")
    val discountedPriceSet: MoneySet?,
    @Json(name = "is_removed")
    val isRemoved: Boolean,
    @Json(name = "phone")
    val phone: String?,
    @Json(name = "price")
    @JsonString
    val price: Double?,
    @Json(name = "price_set")
    val priceSet: MoneySet?,
    @Json(name = "requested_fulfillment_service_id")
    val requestedFulfillmentServiceId: String?,
    @Json(name = "source")
    val source: String?,
    @Json(name = "title")
    val title: String?,
    @Json(name = "tax_lines")
    val taxLines: List<TaxLine>?,
    @Json(name = "discount_allocations")
    val discountAllocations: List<Any>?
)

package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString
import java.time.LocalDateTime

data class Order(
    @Json(name = "id")
    val id: Long,
    @Json(name = "email")
    val email: String?,
    @Json(name = "created_at")
    val createdAt: LocalDateTime?,
    @Json(name = "updated_at")
    val updatedAt: LocalDateTime?,
    @Json(name = "number")
    val number: Int,
    @Json(name = "note")
    val note: String?,
    @Json(name = "token")
    val token: String?,
    @Json(name = "gateway")
    val gateway: String?,
    @Json(name = "test")
    val test: Boolean,
    @Json(name = "total_price")
    @JsonString
    val totalPrice: Double?,
    @Json(name = "subtotal_price")
    @JsonString
    val subtotalPrice: Double?,
    @Json(name = "total_weight")
    val totalWeight: Int,
    @Json(name = "total_tax")
    @JsonString
    val totalTax: Double?,
    @Json(name = "taxes_included")
    val taxesIncluded: Boolean,
    @Json(name = "currency")
    val currency: String?,
    @Json(name = "financial_status")
    val financialStatus: FinancialStatus?,
    @Json(name = "confirmed")
    val confirmed: Boolean,
    @Json(name = "total_discounts")
    @JsonString
    val totalDiscounts: Double?,
    @Json(name = "total_line_items_price")
    @JsonString
    val totalLineItemsPrice: Double?,
    @Json(name = "cart_token")
    val cartToken: String?,
    @Json(name = "buyer_accepts_marketing")
    val buyerAcceptsMarketing: Boolean,
    @Json(name = "name")
    val name: String?,
    @Json(name = "referring_site")
    val referringSite: String?,
    @Json(name = "landing_site")
    val landingSite: String?,
    @Json(name = "cancelled_at")
    val cancelledAt: LocalDateTime?,
    @Json(name = "cancel_reason")
    val cancelReason: CancelReason?,
    @Json(name = "total_price_usd")
    @JsonString
    val totalPriceUsd: Double?,
    @Json(name = "checkout_token")
    val checkoutToken: String?,
    @Json(name = "reference")
    val reference: String?,
    @Json(name = "user_id")
    val userId: Long?,
    @Json(name = "location_id")
    val locationId: Long?,
    @Json(name = "source_identifier")
    val sourceIdentifier: String?,
    @Json(name = "source_url")
    val sourceUrl: String?,
    @Json(name = "processed_at")
    val processedAt: LocalDateTime?,
    @Json(name = "device_id")
    val deviceId: Long?,
    @Json(name = "phone")
    val phone: String?,
    @Json(name = "customer_locale")
    val customerLocale: String?,
    @Json(name = "app_id")
    val appId: Long?,
    @Json(name = "browser_ip")
    val browserIp: String?,
    @Json(name = "landing_site_ref")
    val landingSiteRef: String?,
    @Json(name = "order_number")
    val orderNumber: Int,
    @Json(name = "discount_applications")
    val discountApplications: List<Any>?,
    @Json(name = "discount_codes")
    val discountCodes: List<Any>?,
    @Json(name = "note_attributes")
    val noteAttributes: List<Any>?,
    @Json(name = "payment_gateway_names")
    val paymentGatewayNames: List<String>?,
    @Json(name = "processing_method")
    val processingMethod: ProcessingMethod?,
    @Json(name = "checkout_id")
    val checkoutId: Long?,
    @Json(name = "source_name")
    val sourceName: String?,
    @Json(name = "fulfillment_status")
    val fulfillmentStatus: FulfillmentStatus?,
    @Json(name = "tax_lines")
    val taxLines: List<TaxLine>?,
    @Json(name = "tags")
    val tags: String?,
    @Json(name = "contact_email")
    val contactEmail: String?,
    @Json(name = "order_status_url")
    val orderStatusUrl: String?,
    @Json(name = "presentment_currency")
    val presentmentCurrency: String?,
    @Json(name = "total_line_items_price_set")
    val totalLineItemsPriceSet: MoneySet?, 
    @Json(name = "total_discounts_set")
    val totalDiscountsSet: MoneySet?,
    @Json(name = "total_shipping_price_set")
    val totalShippingPriceSet: MoneySet?,
    @Json(name = "subtotal_price_set")
    val subtotalPriceSet: MoneySet?,
    @Json(name = "total_price_set")
    val totalPriceSet: MoneySet?,
    @Json(name = "total_tax_set")
    val totalTaxSet: MoneySet?,
    @Json(name = "line_items")
    val lineItems: List<LineItem>?,
    @Json(name = "fulfillments")
    val fulfillments: List<Any>?,
    @Json(name = "refunds")
    val refunds: List<Any>?,
    @Json(name = "total_tip_received")
    @JsonString
    val totalTipReceived: Double?,
    @Json(name = "original_total_duties_set")
    val originalTotalDutiesSet: MoneySet?,
    @Json(name = "current_total_duties_set")
    val currentTotalDutiesSet: MoneySet?,
    @Json(name = "admin_graphql_api_id")
    val adminGraphqlApiId: String?,
    @Json(name = "shipping_lines")
    val shippingLines: List<ShippingLine>?,
    @Json(name = "billing_address")
    val billingAddress: Address?,
    @Json(name = "shipping_address")
    val shippingAddress: Address?,
    @Json(name = "customer")
    val customer: Customer?,
    @Json(name = "client_details")
    val clientDetails: ClientDetails?,
    @Json(name = "current_subtotal_price")
    @JsonString
    val currentSubtotalPrice: Double?,
    @Json(name = "current_subtotal_price_set")
    val currentSubtotalPriceSet: MoneySet?,
    @Json(name = "current_total_additional_fees_set")
    val currentTotalAdditionalFeesSet: MoneySet?,
    @Json(name = "current_total_discounts")
    @JsonString
    val currentTotalDiscounts: Double?,
    @Json(name = "current_total_discounts_set")
    val currentTotalDiscountsSet: MoneySet?,
    @Json(name = "current_total_price")
    @JsonString
    val currentTotalPrice: Double?,
    @Json(name = "current_total_price_set")
    val currentTotalPriceSet: MoneySet?,
    @Json(name = "current_total_tax")
    @JsonString
    val currentTotalTax: Double?,
    @Json(name = "current_total_tax_set")
    val currentTotalTaxSet: MoneySet?,
    @Json(name = "original_total_additional_fees_set")
    val originalTotalAdditionalFeesSet: MoneySet?,
    @Json(name = "payment_terms")
    val paymentTerms: Any?,
    @Json(name = "total_cash_rounding_payment_adjustment_set")
    val totalCashRoundingPaymentAdjustmentSet: MoneySet?,
    @Json(name = "total_cash_rounding_refund_adjustment_set")
    val totalCashRoundingRefundAdjustmentSet: MoneySet?,
    @Json(name = "total_outstanding")
    @JsonString
    val totalOutstanding: Double?
)

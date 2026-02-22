package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class DiscountAllocation(
    @Json(name = "amount") @JsonString val amount: Double,
    @Json(name = "discount_application_index") val discountApplicationIndex: Int,
    @Json(name = "amount_set") val amountSet: MoneySet?,
)

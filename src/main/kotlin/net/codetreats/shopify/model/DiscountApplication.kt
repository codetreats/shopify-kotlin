package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class DiscountApplication(
    @Json(name = "target_type") val targetType: String?,
    @Json(name = "type") val type: String?,
    @Json(name = "value") @JsonString val value: Double?,
    @Json(name = "value_type") val valueType: String?,
    @Json(name = "allocation_method") val allocationMethod: String?,
    @Json(name = "target_selection") val targetSelection: String?,
    @Json(name = "code") val code: String?,
)

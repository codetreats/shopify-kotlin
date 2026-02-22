package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class TransactionReceipt(
    @Json(name = "testcase") val testcase: Boolean?,
    @Json(name = "authorization") val authorization: String?,
    @Json(name = "paid_amount") @JsonString val paidAmount: Double?,
)

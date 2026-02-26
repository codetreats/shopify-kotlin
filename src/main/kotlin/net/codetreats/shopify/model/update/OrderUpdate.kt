package net.codetreats.shopify.model.update

import com.squareup.moshi.Json
import net.codetreats.shopify.model.FinancialStatus

data class OrderUpdate(
        @Json(name = "financial_status") val financialStatus: FinancialStatus? = null,
)

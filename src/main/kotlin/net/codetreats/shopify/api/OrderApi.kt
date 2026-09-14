package net.codetreats.shopify.api

import java.time.LocalDateTime
import net.codetreats.shopify.ShopifyClient
import net.codetreats.shopify.ShopifyListResponse
import net.codetreats.shopify.model.FinancialStatus
import net.codetreats.shopify.model.FulfillmentStatus
import net.codetreats.shopify.model.Order
import net.codetreats.shopify.model.OrderStatus

class OrderApi(private val shopifyClient: ShopifyClient) {
    fun get(
            limit: Int? = null,
            status: OrderStatus? = null,
            financialStatus: FinancialStatus? = null,
            fulfillmentStatus: FulfillmentStatus? = null,
            sinceId: Long? = null,
            createdAtMin: LocalDateTime? = null,
            createdAtMax: LocalDateTime? = null,
            updatedAtMin: LocalDateTime? = null,
            updatedAtMax: LocalDateTime? = null,
            fields: String? = null,
    ): ShopifyListResponse<Order> {
        val params = mutableMapOf<String, String?>()
        params["limit"] = limit?.toString()
        params["status"] = status?.toString()?.lowercase()
        params["financial_status"] = financialStatus?.toString()?.lowercase()
        params["fulfillment_status"] = fulfillmentStatus?.toString()?.lowercase()
        params["since_id"] = sinceId?.toString()
        params["created_at_min"] = createdAtMin?.toString()
        params["created_at_max"] = createdAtMax?.toString()
        params["updated_at_min"] = updatedAtMin?.toString()
        params["updated_at_max"] = updatedAtMax?.toString()
        params["fields"] = fields

        return shopifyClient.get<Order>("orders", "/orders.json", params)
    }

    fun getElement(id: Long): Order {
        return shopifyClient.getElement<Order>("order", "/orders/$id.json")
    }
}

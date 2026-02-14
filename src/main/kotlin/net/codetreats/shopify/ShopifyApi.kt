package net.codetreats.shopify

import net.codetreats.shopify.model.*
import java.time.LocalDateTime

class ShopifyApi(private val shopifyClient: ShopifyClient) {

    /**
     * returns the orders of the shop
     */
    fun orders(
        limit: Int? = null,
        status: OrderStatus? = null,
        financialStatus: FinancialStatus? = null,
        fulfillmentStatus: FulfillmentStatus? = null,
        sinceId: Long? = null,
        createdAtMin: LocalDateTime? = null,
        createdAtMax: LocalDateTime? = null,
        updatedAtMin: LocalDateTime? = null,
        updatedAtMax: LocalDateTime? = null,
        fields: String? = null
    ): ShopifyListResponse<Order> {
        val params = mutableMapOf<String, String?>()
        params["limit"] = limit.toString()
        params["status"] = status?.toString()?.toLowerCase()
        params["financial_status"] = financialStatus?.toString()?.toLowerCase()
        params["fulfillment_status"] = fulfillmentStatus?.toString()?.toLowerCase()
        params["since_id"] = sinceId?.toString()
        params["created_at_min"] = createdAtMin?.toString()
        params["created_at_max"] = createdAtMax?.toString()
        params["updated_at_min"] = updatedAtMin?.toString()
        params["updated_at_max"] = updatedAtMax?.toString()
        params["fields"] = fields
        
        return shopifyClient.get<Order>("orders", "/orders.json", params)
    }

    /**
     * returns the products of the shop
     */
    fun products(
        limit: Int? = null,
        ids: String? = null,
        sinceId: Long? = null,
        title: String? = null,
        vendor: String? = null,
        handle: String? = null,
        productType: String? = null,
        collectionId: Long? = null,
        createdAtMin: LocalDateTime? = null,
        createdAtMax: LocalDateTime? = null,
        updatedAtMin: LocalDateTime? = null,
        updatedAtMax: LocalDateTime? = null,
        publishedAtMin: LocalDateTime? = null,
        publishedAtMax: LocalDateTime? = null,
        publishedStatus: String? = null,
        fields: String? = null,
        presentmentCurrencies: String? = null
    ): ShopifyListResponse<Product> {
        val params = mutableMapOf<String, String?>()
        params["limit"] = limit.toString()
        params["ids"] = ids
        params["since_id"] = sinceId?.toString()
        params["title"] = title
        params["vendor"] = vendor
        params["handle"] = handle
        params["product_type"] = productType
        params["collection_id"] = collectionId?.toString()
        params["created_at_min"] = createdAtMin?.toString()
        params["created_at_max"] = createdAtMax?.toString()
        params["updated_at_min"] = updatedAtMin?.toString()
        params["updated_at_max"] = updatedAtMax?.toString()
        params["published_at_min"] = publishedAtMin?.toString()
        params["published_at_max"] = publishedAtMax?.toString()
        params["published_status"] = publishedStatus
        params["fields"] = fields
        params["presentment_currencies"] = presentmentCurrencies
        
        return shopifyClient.get<Product>("products", "/products.json", params)
    }

    /**
     * returns transactions for an order
     */
    fun transactions(
        orderId: Long,
        sinceId: Long? = null,
        fields: String? = null,
        inContext: Boolean? = null
    ): ShopifyListResponse<Transaction> {
        val params = mutableMapOf<String, String?>()
        params["since_id"] = sinceId?.toString()
        params["fields"] = fields
        params["in_context"] = inContext?.toString()
        
        return shopifyClient.get<Transaction>("transactions", "/orders/$orderId/transactions.json", params)
    }

}

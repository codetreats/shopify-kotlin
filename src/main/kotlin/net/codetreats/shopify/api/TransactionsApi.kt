package net.codetreats.shopify.api

import net.codetreats.shopify.ShopifyClient
import net.codetreats.shopify.model.ShopifyListResponse
import net.codetreats.shopify.model.Transaction

class TransactionsApi(private val shopifyClient: ShopifyClient) {
    fun get(
        orderId: Long,
        sinceId: Long? = null,
        fields: String? = null,
        inContext: Boolean? = null,
    ): ShopifyListResponse<Transaction> {
        val params = mutableMapOf<String, String?>()
        params["since_id"] = sinceId?.toString()
        params["fields"] = fields
        params["in_context"] = inContext?.toString()

        return shopifyClient.get<Transaction>(
            "transactions",
            "/orders/$orderId/transactions.json",
            params,
        )
    }
}

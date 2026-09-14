package net.codetreats.shopify.api

import net.codetreats.shopify.ShopifyClient
import net.codetreats.shopify.ShopifyListResponse
import net.codetreats.shopify.model.Transaction
import net.codetreats.shopify.model.create.CreateTransaction

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

    fun create(
        orderId: Long,
        createTransaction: CreateTransaction,
        source: String? = "external",
    ): Transaction {
        val params = if (source == null) mapOf() else mapOf("source" to source)
        return shopifyClient.postElement<
                Transaction, CreateTransaction>(
                "transaction",
                "/orders/$orderId/transactions.json",
                createTransaction,
                params,
        )
    }
}

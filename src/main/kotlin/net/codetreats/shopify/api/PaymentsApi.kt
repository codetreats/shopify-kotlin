package net.codetreats.shopify.api

import net.codetreats.shopify.ShopifyClient
import net.codetreats.shopify.model.ShopifyListResponse
import net.codetreats.shopify.model.ShopifyPaymentsBalance
import net.codetreats.shopify.model.ShopifyPaymentsPayout
import net.codetreats.shopify.model.ShopifyPaymentsTransaction
import java.time.LocalDateTime

class PaymentsApi(private val shopifyClient: ShopifyClient) {
    fun payouts(
        limit: Int? = null,
        status: String? = null,
        dateMin: LocalDateTime? = null,
        dateMax: LocalDateTime? = null,
        processedAtMin: LocalDateTime? = null,
        processedAtMax: LocalDateTime? = null,
        sinceId: Long? = null,
        lastId: Long? = null,
    ): ShopifyListResponse<ShopifyPaymentsPayout> {
        val params = mutableMapOf<String, String?>()
        params["limit"] = limit?.toString()
        params["status"] = status
        params["date_min"] = dateMin?.toString()
        params["date_max"] = dateMax?.toString()
        params["processed_at_min"] = processedAtMin?.toString()
        params["processed_at_max"] = processedAtMax?.toString()
        params["since_id"] = sinceId?.toString()
        params["last_id"] = lastId?.toString()

        return shopifyClient.get<ShopifyPaymentsPayout>(
            "payouts",
            "/shopify_payments/payouts.json",
            params,
        )
    }

    fun transactions(
        limit: Int? = null,
        payoutId: Long? = null,
        test: Boolean? = null,
        sinceId: Long? = null,
        lastId: Long? = null,
    ): ShopifyListResponse<ShopifyPaymentsTransaction> {
        val params = mutableMapOf<String, String?>()
        params["limit"] = limit?.toString()
        params["payout_id"] = payoutId?.toString()
        params["test"] = test?.toString()
        params["since_id"] = sinceId?.toString()
        params["last_id"] = lastId?.toString()

        return shopifyClient.get<ShopifyPaymentsTransaction>(
            "transactions",
            "/shopify_payments/balance/transactions.json",
            params,
        )
    }

    fun balance(): ShopifyListResponse<ShopifyPaymentsBalance> {
        return shopifyClient.get<ShopifyPaymentsBalance>(
            "balance",
            "/shopify_payments/balance.json",
        )
    }
}

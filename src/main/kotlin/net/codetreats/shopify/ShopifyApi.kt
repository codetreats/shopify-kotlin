package net.codetreats.shopify

import net.codetreats.shopify.api.OrderApi
import net.codetreats.shopify.api.PaymentsApi
import net.codetreats.shopify.api.TransactionsApi

class ShopifyApi(private val shopifyClient: ShopifyClient) {
    val orders = OrderApi(shopifyClient)

    val payments = PaymentsApi(shopifyClient)

    val transactions = TransactionsApi(shopifyClient)
}

package net.codetreats.shopify.model

import com.squareup.moshi.Json

data class MoneySet(
    @Json(name = "shop_money")
    val shopMoney: Money?,
    @Json(name = "presentment_money")
    val presentmentMoney: Money?,
)

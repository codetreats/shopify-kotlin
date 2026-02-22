package net.codetreats.shopify.model

import com.squareup.moshi.Json
import net.codetreats.shopify.util.JsonString

data class TaxLine(
    @Json(name = "price")
    @JsonString
    val price: Double?,
    @Json(name = "rate")
    val rate: Double?,
    @Json(name = "title")
    val title: String?,
    @Json(name = "price_set")
    val priceSet: MoneySet?,
    @Json(name = "channel_liable")
    val channelLiable: Boolean?,
)

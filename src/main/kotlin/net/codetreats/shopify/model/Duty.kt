package net.codetreats.shopify.model

import com.squareup.moshi.Json

data class Duty(
    @Json(name = "id") val id: String,
    @Json(name = "harmonized_system_code") val harmonizedSystemCode: String?,
    @Json(name = "country_code_of_origin") val countryCodeOfOrigin: String?,
    @Json(name = "shop_money") val shopMoney: Money?,
    @Json(name = "presentment_money") val presentmentMoney: Money?,
    @Json(name = "tax_lines") val taxLines: List<TaxLine>?,
    @Json(name = "admin_graphql_api_id") val adminGraphqlApiId: String?,
)

package net.codetreats.shopify.model

import com.squareup.moshi.Json

data class Address(
    @Json(name = "id")
    val id: Long?,
    @Json(name = "first_name")
    val firstName: String?,
    @Json(name = "last_name")
    val lastName: String?,
    @Json(name = "company")
    val company: String?,
    @Json(name = "address1")
    val address1: String?,
    @Json(name = "address2")
    val address2: String?,
    @Json(name = "city")
    val city: String?,
    @Json(name = "zip")
    val zip: String?,
    @Json(name = "province")
    val province: String?,
    @Json(name = "country")
    val country: String?,
    @Json(name = "phone")
    val phone: String?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "province_code")
    val provinceCode: String?,
    @Json(name = "country_code")
    val countryCode: String?,
    @Json(name = "country_name")
    val countryName: String?,
    @Json(name = "default")
    val default: Boolean?,
    @Json(name = "latitude")
    val latitude: Double?,
    @Json(name = "longitude")
    val longitude: Double?,
)

package net.codetreats.shopify.model

import com.squareup.moshi.Json

data class NoteAttribute(
    @Json(name = "name") val name: String,
    @Json(name = "value") val value: String,
)

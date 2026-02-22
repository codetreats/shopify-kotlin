package net.codetreats.shopify.util

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class JsonString

class JsonStringDoubleAdapter {
    @FromJson
    @JsonString
    fun fromJsonDouble(json: String): Double {
        return json.toDouble()
    }

    @FromJson
    @JsonString
    fun fromJsonNullableDouble(json: String?): Double? {
        return json?.toDoubleOrNull()
    }

    @ToJson
    fun toJsonDouble(@JsonString value: Double): String {
        return value.toString()
    }

    @ToJson
    fun toJsonNullableDouble(@JsonString value: Double?): String? {
        return value?.toString()
    }
}

class JsonStringIntAdapter {
    @FromJson
    @JsonString
    fun fromJsonInt(json: String): Int {
        return json.toInt()
    }

    @FromJson
    @JsonString
    fun fromJsonNullableInt(json: String?): Int? {
        return json?.toIntOrNull()
    }

    @ToJson
    fun toJsonInt(@JsonString value: Int): String {
        return value.toString()
    }

    @ToJson
    fun toJsonNullableInt(@JsonString value: Int?): String? {
        return value?.toString()
    }
}

class JsonStringLongAdapter {
    @FromJson
    @JsonString
    fun fromJsonLong(json: String): Long {
        return json.toLong()
    }

    @FromJson
    @JsonString
    fun fromJsonNullableLong(json: String?): Long? {
        return json?.toLongOrNull()
    }

    @ToJson
    fun toJsonLong(@JsonString value: Long): String {
        return value.toString()
    }

    @ToJson
    fun toJsonNullableLong(@JsonString value: Long?): String? {
        return value?.toString()
    }
}

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
    fun fromJson(json: String): Double? {
        return json.toDouble()
    }

    @ToJson
    fun toJson(@JsonString value: Double?): String? {
        return value?.toString()
    }
}

class JsonStringIntAdapter {
    @FromJson
    @JsonString
    fun fromJson(json: String): Int? {
        return json.toInt()
    }

    @ToJson
    fun toJson(@JsonString value: Int?): String? {
        return value?.toString()
    }
}

class JsonStringLongAdapter {
    @FromJson
    @JsonString
    fun fromJson(json: String): Long? {
        return json.toLong()
    }

    @ToJson
    fun toJson(@JsonString value: Long?): String? {
        return value?.toString()
    }
}

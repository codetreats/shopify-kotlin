package net.codetreats.shopify.model

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import net.codetreats.shopify.util.JsonStringDoubleAdapter
import net.codetreats.shopify.util.JsonStringIntAdapter
import net.codetreats.shopify.util.JsonStringLongAdapter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DiscountCodeTest {
    @Test
    fun testDiscountCodeParsing() {
        val moshi =
            Moshi.Builder()
                .add(JsonStringDoubleAdapter())
                .add(JsonStringIntAdapter())
                .add(JsonStringLongAdapter())
                .addLast(KotlinJsonAdapterFactory())
                .build()

        val json =
            """
            {
                "code": "SUMMER_SALE",
                "amount": "10.0",
                "type": "fixed_amount"
            }
            """.trimIndent()

        val adapter = moshi.adapter(DiscountCode::class.java)
        val discountCode = adapter.fromJson(json)

        assertEquals("SUMMER_SALE", discountCode?.code)
        assertEquals(10.0, discountCode?.amount)
        assertEquals("fixed_amount", discountCode?.type)
    }

    @Test
    fun testNullableDoubleParsing() {
        val moshi =
            Moshi.Builder()
                .add(JsonStringDoubleAdapter())
                .add(JsonStringIntAdapter())
                .add(JsonStringLongAdapter())
                .addLast(KotlinJsonAdapterFactory())
                .build()

        val json = """{"amount": "12.34"}"""
        val adapter = moshi.adapter(NullableModel::class.java)
        val result = adapter.fromJson(json)
        assertEquals(12.34, result?.amount)

        val jsonNull = """{"amount": null}"""
        val resultNull = adapter.fromJson(jsonNull)
        assertEquals(null, resultNull?.amount)
    }

    data class NullableModel(@net.codetreats.shopify.util.JsonString val amount: Double?)
}

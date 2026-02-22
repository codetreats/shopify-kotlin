package net.codetreats.shopify.util

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import java.time.Month

class LocalDateTimeAdapterTest {
    private val moshi = Moshi.Builder()
        .add(LocalDateTimeAdapter())
        .add(KotlinJsonAdapterFactory())
        .build()

    @Test
    fun `parses ISO-8601 string with offset to LocalDateTime in UTC`() {
        val adapter: JsonAdapter<LocalDateTime> = moshi.adapter(LocalDateTime::class.java)
        val json = "\"2026-02-04T17:50:14+01:00\""

        val result = adapter.fromJson(json)

        // 17:50:14 +01:00 is 16:50:14 UTC
        val expected = LocalDateTime.of(2026, Month.FEBRUARY, 4, 16, 50, 14)

        assertEquals(expected, result)
    }

    @Test
    fun `writes LocalDateTime as ISO-8601 string in UTC`() {
        val adapter: JsonAdapter<LocalDateTime> = moshi.adapter(LocalDateTime::class.java)
        // 16:50:14 UTC
        val dateTime = LocalDateTime.of(2026, Month.FEBRUARY, 4, 16, 50, 14)

        val json = adapter.toJson(dateTime)

        // Expect "2026-02-04T16:50:14Z"
        assertEquals("\"2026-02-04T16:50:14Z\"", json)
    }
}

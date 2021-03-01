package com.jeremieguillot.retrofitcall.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HistoricalEvents(
    @Json(name = "id")
    val id: Int,
    @Json(name = "title")
    val title: String,
    @Json(name = "details")
    val details: String,
    @Json(name = "flight_number")
    val flightNumber: Int?
)


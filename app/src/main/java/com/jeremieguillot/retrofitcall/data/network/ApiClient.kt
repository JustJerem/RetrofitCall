package com.jeremieguillot.retrofitcall.data.network

import com.jeremieguillot.retrofitcall.data.model.HistoricalEvents
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {

    @GET("history")
    suspend fun getHistory(): Response<List<HistoricalEvents>>
}

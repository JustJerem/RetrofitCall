package com.jeremieguillot.retrofitcall.data

import com.jeremieguillot.retrofitcall.data.network.ApiClient

class EventsRepository(
    private val apiClient: ApiClient
) {
    suspend fun getHistoricalEvents() = apiClient.getHistory()
}
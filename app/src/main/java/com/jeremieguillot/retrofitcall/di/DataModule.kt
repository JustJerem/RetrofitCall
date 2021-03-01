package com.jeremieguillot.retrofitcall.di

import com.jeremieguillot.retrofitcall.data.EventsRepository
import com.jeremieguillot.retrofitcall.data.network.ApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object DataModule {

    @Singleton
    @Provides
    fun provideEventsRepository(
        apiClient: ApiClient,
    ): EventsRepository {
        return EventsRepository(apiClient)
    }
}
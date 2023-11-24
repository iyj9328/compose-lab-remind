package com.example.marsphotos.network

import com.example.marsphotos.data.repository.MarsRepository
import com.example.marsphotos.data.repository.impl.MarsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MarsServiceModule {
    @Binds
    @Singleton
    abstract fun bindMarsRepository(
        marsRepositoryImpl: MarsRepositoryImpl
    ): MarsRepository

    companion object {
        @Provides
        @Singleton
        fun provideMarsService(): MarsApiService {
            val retrofitBuilder by lazy { MarsApiRetrofit() }
            return retrofitBuilder.getDefaultBuilder().create(MarsApiService::class.java)
        }
    }
}
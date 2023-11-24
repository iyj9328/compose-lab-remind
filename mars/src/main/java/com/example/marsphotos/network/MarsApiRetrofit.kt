package com.example.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

class MarsApiRetrofit {
    private val retrofitBuilder = Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    fun getDefaultBuilder(): Retrofit = retrofitBuilder

    companion object {
        private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"
    }
}
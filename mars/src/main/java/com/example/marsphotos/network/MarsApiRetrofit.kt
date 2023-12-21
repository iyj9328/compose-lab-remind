package com.example.marsphotos.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

class MarsApiRetrofit {
    private val retrofitBuilder = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()

    fun getDefaultBuilder(): Retrofit = retrofitBuilder

    companion object {
        private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"
    }
}
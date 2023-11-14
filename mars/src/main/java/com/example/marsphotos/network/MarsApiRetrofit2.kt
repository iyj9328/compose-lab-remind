package com.example.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

class MarsApiRetrofit2 {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    companion object {
        private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

    }
}
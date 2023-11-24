package com.example.marsphotos.network

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface MarsApiService {
    @GET("/photos")
    suspend fun getPhotos(): String
}
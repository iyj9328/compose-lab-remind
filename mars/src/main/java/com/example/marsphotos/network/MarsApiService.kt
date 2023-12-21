package com.example.marsphotos.network

import com.example.marsphotos.data.dto.MarsDto
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface MarsApiService {
    @GET("/photos")
    suspend fun getPhotos(): List<MarsDto>
}
package com.example.marsphotos.data.repository

interface MarsRepository {
    suspend fun getMarsList(): String
}
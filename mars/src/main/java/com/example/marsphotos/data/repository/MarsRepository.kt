package com.example.marsphotos.data.repository

import com.example.marsphotos.data.dto.MarsDto

interface MarsRepository {
    suspend fun getMarsList(): List<MarsDto>
}
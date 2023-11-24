package com.example.marsphotos.data.repository.impl

import com.example.marsphotos.data.repository.MarsRepository
import com.example.marsphotos.network.MarsApiService
import javax.inject.Inject

class MarsRepositoryImpl @Inject constructor(
    private val marsApiService: MarsApiService
): MarsRepository {
    override suspend fun getMarsList(): String {
        return marsApiService.getPhotos()
    }
}
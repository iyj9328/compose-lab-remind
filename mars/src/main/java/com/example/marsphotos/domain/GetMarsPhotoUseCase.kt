package com.example.marsphotos.domain

import com.example.marsphotos.data.repository.MarsRepository
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetMarsPhotoUseCase @Inject constructor(
    private val marsRepository: MarsRepository
) {
    suspend operator fun invoke() = withContext(Dispatchers.Default) {
        marsRepository.getMarsList()
    }
}
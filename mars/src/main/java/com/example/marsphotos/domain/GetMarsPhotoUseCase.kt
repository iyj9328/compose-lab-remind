package com.example.marsphotos.domain

import com.example.marsphotos.data.repository.MarsRepository
import com.example.marsphotos.data.repository.toMarsDataList
import com.example.marsphotos.domain.model.MarsUiState
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetMarsPhotoUseCase @Inject constructor(
    private val marsRepository: MarsRepository
) {
    suspend operator fun invoke() = withContext(Dispatchers.Default) {
        try {
            MarsUiState.Success("Success: ${marsRepository.getMarsList().size} Mars photos retrieved")
        } catch (e: Exception) {
            MarsUiState.Fail
        }
    }
}
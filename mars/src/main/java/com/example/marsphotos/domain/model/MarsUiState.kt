package com.example.marsphotos.domain.model


sealed class MarsUiState {
    data class Success(val photos: String): MarsUiState()
    object Loading: MarsUiState()
    object Fail: MarsUiState()
}

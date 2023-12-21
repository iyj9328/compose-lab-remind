package com.example.marsphotos.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarsDto(
    @SerialName("id")
    val id: Int,
    @SerialName("img_src")
    val imgSrc: String
)
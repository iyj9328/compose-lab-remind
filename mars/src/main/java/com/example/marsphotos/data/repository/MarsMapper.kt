package com.example.marsphotos.data.repository

import com.example.marsphotos.data.dto.MarsDto
import com.example.marsphotos.domain.model.MarsData

fun List<MarsDto>.toMarsDataList() = this.map {
    MarsData(it.id, it.imgSrc)
}
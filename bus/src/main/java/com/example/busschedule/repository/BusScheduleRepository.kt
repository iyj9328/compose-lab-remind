package com.example.busschedule.repository

import com.example.busschedule.data.BusScheduleEntity
import kotlinx.coroutines.flow.Flow

interface BusScheduleRepository {
    fun getBusScheduleListFromDB(): Flow<List<BusScheduleEntity>>
}
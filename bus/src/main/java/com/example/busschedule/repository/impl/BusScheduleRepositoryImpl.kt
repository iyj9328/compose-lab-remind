package com.example.busschedule.repository.impl

import com.example.busschedule.BusScheduleDao
import com.example.busschedule.data.BusScheduleEntity
import com.example.busschedule.repository.BusScheduleRepository
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class BusScheduleRepositoryImpl @Inject constructor(
    private val busScheduleDao: BusScheduleDao
): BusScheduleRepository {
    override fun getBusScheduleListFromDB(): Flow<List<BusScheduleEntity>> {
        return busScheduleDao.getBusScheduleList()
    }
}
package com.example.busschedule

import androidx.room.Dao
import androidx.room.Query
import com.example.busschedule.data.BusScheduleEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query("SELECT * FROM bus_schedule")
    fun getBusScheduleList(): Flow<List<BusScheduleEntity>>
}
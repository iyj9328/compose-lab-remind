package com.example.busschedule

import com.example.busschedule.data.BusSchedule
import com.example.busschedule.data.BusScheduleEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

fun List<BusScheduleEntity>.toBusScheduleList() = this.map {
    BusSchedule(
        id = it.id,
        stopName = it.stopName,
        arrivalTimeInMillis = it.arrivalTimeInMillis,
    )
}
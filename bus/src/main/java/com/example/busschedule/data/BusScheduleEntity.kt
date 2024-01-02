package com.example.busschedule.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.busschedule.data.BusScheduleEntity.Companion.BUS_SCHEDULE_TABLE_NAME

@Entity(tableName = BUS_SCHEDULE_TABLE_NAME)
data class BusScheduleEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "stopName") val stopName: String,
    @ColumnInfo(name = "arrivalTimeInMillis") val arrivalTimeInMillis: Int,
) {
    companion object {
        const val BUS_SCHEDULE_TABLE_NAME = "bus_schedule"
    }
}
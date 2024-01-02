package com.example.busschedule

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.busschedule.data.BusScheduleEntity

@Database(entities = [BusScheduleEntity::class], version = 1, exportSchema = false)
abstract class BusAppDataBase: RoomDatabase() {
    abstract fun getBusScheduleDao(): BusScheduleDao
    companion object {
        @Volatile
        private var Instance: BusAppDataBase? = null

        fun getDatabase(context: Context): BusAppDataBase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context,
                    BusAppDataBase::class.java,
                    "bus_database"
                ).build().also { Instance = it }
            }
        }
    }
}
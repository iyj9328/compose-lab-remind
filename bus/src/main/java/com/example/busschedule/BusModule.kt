package com.example.busschedule

import com.example.busschedule.repository.BusScheduleRepository
import com.example.busschedule.repository.impl.BusScheduleRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface BusModule {
    @Binds
    @ViewModelScoped
    fun bindBusScheduleRepository(
        busScheduleRepositoryImpl: BusScheduleRepositoryImpl
    ): BusScheduleRepository
}
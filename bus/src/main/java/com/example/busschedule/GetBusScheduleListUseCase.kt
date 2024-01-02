package com.example.busschedule

import com.example.busschedule.repository.BusScheduleRepository
import javax.inject.Inject
import kotlinx.coroutines.flow.map

class GetBusScheduleListUseCase @Inject constructor(
    private val busScheduleRepository: BusScheduleRepository
) {
    operator fun invoke() =
        busScheduleRepository.getBusScheduleListFromDB().map { it.toBusScheduleList() }
}
package com.example.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

/**
 * 사용자의 위/경도 데이터를 가져오는 뷰모델 클래스
 * */
class LocationViewModel: ViewModel() {
    // private로 실제 변수는 보호
    private val _location = mutableStateOf<LocationData?>(null)

    val location: State<LocationData?> = _location

    fun updateLocation(newLocation: LocationData) {
        _location.value = newLocation

    }
}
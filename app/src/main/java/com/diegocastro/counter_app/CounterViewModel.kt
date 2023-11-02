package com.diegocastro.counter_app

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel() {
    // This class will act as View Model for the application
    var count by mutableStateOf(0)
    fun increaseCounter(){
        count++
    }

}
package com.example.geryshoppinglistapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel() {
    private val _counterRepository = CounterRepository()
    private val _count = mutableIntStateOf(_counterRepository.getCounter().count)

    // Expose the count as an immutable state
    val count: MutableState<Int> = _count

    fun increment() {
        _counterRepository.incrementCounter()
        _count.intValue = _counterRepository.getCounter().count
    }

    fun decrement() {
        _counterRepository.decrementCounter()
        _count.intValue = _counterRepository.getCounter().count
    }
}
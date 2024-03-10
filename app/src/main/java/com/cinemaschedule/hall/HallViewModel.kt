package com.cinemaschedule.hall

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HallViewModel : ViewModel() {

	private val _state= MutableStateFlow<HallState>(HallState.Initial)
	val state: StateFlow<HallState> = _state.asStateFlow()
}
package com.cinemaschedule.hall

sealed interface HallState {

	object Initial : HallState

	object Content : HallState
}
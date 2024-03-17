package com.cinemaschedule.hall

sealed interface HallState {

	object Initial : HallState

	data class Content(
		val seatArrangement: List<List<Seat>>,
		val seatArrangementColumns: Int,
	) : HallState
}
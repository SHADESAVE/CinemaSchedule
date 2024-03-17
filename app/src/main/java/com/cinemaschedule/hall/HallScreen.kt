package com.cinemaschedule.hall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cinemaschedule.hall.Seat.ABSENT
import com.cinemaschedule.hall.Seat.FREE
import com.cinemaschedule.hall.Seat.OCCUPIED
import com.cinemaschedule.hall.Seat.PURCHASED
import com.cinemaschedule.hall.Seat.SELECTED

@Composable
fun HallScreen(
	viewModel: HallViewModel = viewModel()
) {
	when (val state = viewModel.state.collectAsState().value) {
		HallState.Initial    -> Unit
		is HallState.Content -> RenderContent(state)
	}
}

@Composable
private fun RenderContent(state: HallState.Content) {
	Title()
	Description()
	Screen()
	SeatingArrangement(state.seatArrangement, state.seatArrangementColumns)
}

@Composable
private fun Title() {

}

@Composable
private fun Description() {

}

@Composable
private fun Screen() {

}

@Composable
private fun SeatingArrangement(seatArrangement: List<List<Seat>>, seatArrangementColumns: Int) {
	LazyVerticalGrid(
		horizontalArrangement = Arrangement.spacedBy(4.dp),
		verticalArrangement = Arrangement.spacedBy(4.dp),
		columns = GridCells.Fixed(seatArrangementColumns),
		content = {
			seatArrangement.forEachIndexed { _, seats ->
				items(seats) { seat ->
					Seat(seat)
				}
			}
		})
}

@Composable
private fun Seat(seat: Seat) {
	val modifier = Modifier.run {
		when (seat) {
			ABSENT    -> background(Color.Transparent)
			FREE      -> background(Color.Green)
			OCCUPIED  -> background(Color.Red)
			SELECTED  -> background(Color.Yellow)
			PURCHASED -> background(Color.Cyan)
		}
	}

	Box(modifier = modifier.size(20.dp))
}
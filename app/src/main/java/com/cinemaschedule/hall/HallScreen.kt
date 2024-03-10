package com.cinemaschedule.hall

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HallScreen(
	viewModel: HallViewModel = viewModel()
) {
	val state by viewModel.state.collectAsState()

	when(state) {
		HallState.Initial -> Unit
		HallState.Content -> RenderContent(state)
	}
}

@Composable
private fun RenderContent(state: HallState) {
	Title()
	Description()
	Screen()
	SeatingArrangement()
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
private fun SeatingArrangement() {

}

@Composable
private fun Seat() {

}
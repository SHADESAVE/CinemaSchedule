package com.cinemaschedule.hall

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HallScreen(
	viewModel: HallViewModel = viewModel()
) {
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
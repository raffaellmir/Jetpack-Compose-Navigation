package ru.mirov.jetpackcomposenavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

data class Word (val value: String)

@Composable
fun ListScreen (
    navController: NavController
) {

    val testArray = listOf(
        Word("1"),
        Word("2"),
        Word("3"),
        Word("4"),
        Word("5"),
        Word("6"),
        Word("7"),
        Word("8"),
        Word("9"),
        Word("10"),
        Word("11"),
        Word("12"),
        Word("13"),
        Word("14"),
        Word("15"),
        Word("16"),
        Word("17"),
        Word("18"),
        Word("19"),
        Word("20"),
    )

    Scaffold {
        LazyColumn {
            testArray.map {
                item {
                    Text(it.value, modifier = Modifier
                        .padding(24.dp)
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("details")
                        })
                }
            }
        }
    }
}
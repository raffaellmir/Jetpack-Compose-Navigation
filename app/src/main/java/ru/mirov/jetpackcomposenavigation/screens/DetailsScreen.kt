package ru.mirov.jetpackcomposenavigation.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailsScreen (/*word: Word*/) {
    Scaffold {
        Text(text = "List Screen -> Details Screen", modifier = Modifier.padding(24.dp))
    }
}
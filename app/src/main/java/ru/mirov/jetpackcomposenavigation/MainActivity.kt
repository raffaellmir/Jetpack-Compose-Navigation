package ru.mirov.jetpackcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.mirov.jetpackcomposenavigation.screens.DetailsScreen
import ru.mirov.jetpackcomposenavigation.screens.ListScreen
import ru.mirov.jetpackcomposenavigation.screens.PushScreen
import ru.mirov.jetpackcomposenavigation.screens.SearchScreen
import ru.mirov.jetpackcomposenavigation.ui.theme.JetpackComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    val bottomItems = listOf("list", "search", "push")

                    Scaffold(
                        bottomBar = {
                            BottomNavigation {
                                bottomItems.forEach { screen ->
                                    BottomNavigationItem(
                                        selected = false,
                                        onClick = {
                                            navController.navigate(screen)
                                        },
                                        label = { Text(screen) },
                                        icon = {
                                            //TODO
                                        }
                                    )
                                }
                            }
                        }
                    ) {
                        NavHost(navController = navController, startDestination = "list") {
                            composable(route = "list") { ListScreen(navController) }
                            composable(route = "search") { SearchScreen() }
                            composable(route = "push") { PushScreen() }
                            composable(route = "details") { DetailsScreen() }

                        }
                    }
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeNavigationTheme {
    }
}
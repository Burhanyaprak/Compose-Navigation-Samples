package com.burhanyaprak.composenavigationsamples.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.burhanyaprak.composenavigationsamples.screens.DetailScreen
import com.burhanyaprak.composenavigationsamples.screens.MainScreen
import com.burhanyaprak.composenavigationsamples.screens.Screen

@Composable
fun ComposeNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Main.route) {
        composable(Screen.Main.route) {
            MainScreen(
                onNavigateToDetail = { username ->
                    navController.navigate(Screen.Detail.route.replace("{username}", username))
                }
            )
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument("username") { defaultValue = "" })
        ) { backStackEntry ->
            DetailScreen(
                username = backStackEntry.arguments?.getString("username"),
                onNavigateToHome = { navController.navigate(Screen.Main.route) }
            )
        }
    }
}
package com.burhanyaprak.composenavigationsamples.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.burhanyaprak.composenavigationsamples.screens.DetailScreen
import com.burhanyaprak.composenavigationsamples.screens.MainScreen
import com.burhanyaprak.composenavigationsamples.screens.Screen

@Composable
fun ComposeNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Main.route) {
        composable(Screen.Main.route) {
            MainScreen(navController)
        }
        composable(Screen.Detail.route) { navBackStackEntry ->
            val username = navBackStackEntry.arguments?.getString("username")
            DetailScreen(username, navController)
        }
    }
}
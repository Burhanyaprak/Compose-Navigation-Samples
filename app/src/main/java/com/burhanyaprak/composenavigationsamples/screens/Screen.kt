package com.burhanyaprak.composenavigationsamples.screens

import androidx.compose.runtime.Immutable

sealed class Screen(val route: String) {
    @Immutable
    object Main : Screen("main")

    @Immutable
    object Detail : Screen("detail/{username}")
}

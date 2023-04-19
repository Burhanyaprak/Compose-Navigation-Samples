package com.burhanyaprak.composenavigationsamples.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.burhanyaprak.composenavigationsamples.R

@Composable
fun DetailScreen(username: String?, navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "${stringResource(id = R.string.welcome)} $username")
        Button(onClick = {
            navController.navigate(Screen.Main.route)
        }) {
            Text(text = stringResource(id = R.string.go_back_main))
        }
    }
}
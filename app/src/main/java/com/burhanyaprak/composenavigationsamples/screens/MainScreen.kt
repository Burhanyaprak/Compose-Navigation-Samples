package com.burhanyaprak.composenavigationsamples.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.burhanyaprak.composenavigationsamples.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(onNavigateToDetail: (String) -> Unit) {
    var username by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = stringResource(id = R.string.enter_an_username))

        TextField(value = username, onValueChange = {
            username = it
        })
        Button(onClick = {
            onNavigateToDetail(username)
        }) {
            Text(text = stringResource(id = R.string.go_detail))
        }
    }
}
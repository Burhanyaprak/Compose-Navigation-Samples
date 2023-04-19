package com.burhanyaprak.composenavigationsamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.burhanyaprak.composenavigationsamples.navigation.ComposeNavGraph
import com.burhanyaprak.composenavigationsamples.ui.theme.ComposeNavigationSamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationSamplesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeNavGraph()
                }
            }
        }
    }
}
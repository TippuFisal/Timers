package com.tippufisal.timers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.tippufisal.timers.features.timer.presentation.TimerScreenContent
import com.tippufisal.timers.features.timer.viewmodel.TimerViewModel
import com.tippufisal.timers.ui.theme.TimersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimersTheme {
                val timerViewModel: TimerViewModel by viewModels()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TimerScreenContent(timerViewModel)
                }
            }
        }
    }
}

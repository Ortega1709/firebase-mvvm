package com.ortega.firebase_mvvm.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ortega.firebase_mvvm.presentation.theme.FirebasemvvmTheme
import com.ortega.firebase_mvvm.presentation.ui.WhiteNightScreen
import com.ortega.firebase_mvvm.presentation.ui.WhiteNightViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val whiteNightViewModel: WhiteNightViewModel = viewModel()

            FirebasemvvmTheme(darkTheme = whiteNightViewModel._isDarkTheme) {
                WhiteNightScreen(whiteNightViewModel)
            }
        }
    }
}

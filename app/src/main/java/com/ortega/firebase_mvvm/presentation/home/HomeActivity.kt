package com.ortega.firebase_mvvm.presentation.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ortega.firebase_mvvm.presentation.theme.FirebasemvvmTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebasemvvmTheme {
                Home()
            }
        }
    }
}


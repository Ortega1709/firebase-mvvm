package com.ortega.firebase_mvvm.presentation.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class WhiteNightViewModel: ViewModel() {

    var isDarkTheme by mutableStateOf(false)


    fun changeTheme() {
        viewModelScope.launch {
            isDarkTheme = !isDarkTheme
        }
    }

}
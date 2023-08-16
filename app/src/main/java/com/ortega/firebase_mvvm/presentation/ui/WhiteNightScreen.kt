package com.ortega.firebase_mvvm.presentation.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ortega.firebase_mvvm.presentation.theme.FirebasemvvmTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@Composable
fun WhiteNightScreen(whiteNightViewModel: WhiteNightViewModel) {


    Scaffold {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment =Alignment.CenterHorizontally
        ) {

            ListItem(
                headlineContent = { Text(text = "Dark/Light Theme") },
                trailingContent = { Switch(checked = whiteNightViewModel._isDarkTheme, onCheckedChange = {
                    whiteNightViewModel.changeTheme()
                }) }
            )

        }
    }

}
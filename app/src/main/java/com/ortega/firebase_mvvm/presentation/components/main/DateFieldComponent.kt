package com.ortega.firebase_mvvm.presentation.components.main

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.DialogProperties
import java.util.Calendar


@Composable
fun DateFieldComponent(
    selectedDate: Calendar,
    onDateSelected: (Calendar) -> Unit
) {

    var showDialog by remember { mutableStateOf(false) }
    val dialogProperties = remember { DialogProperties() }

    OutlinedTextField(
        value = selectedDate.time.toString(),
        onValueChange = {  },
        readOnly = true,
        modifier = Modifier.fillMaxWidth()
    )

}
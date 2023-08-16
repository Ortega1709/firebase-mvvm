package com.ortega.firebase_mvvm.presentation.components.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetComponent(
    onDismiss: () -> Unit,

) {

   ModalBottomSheet(
       onDismissRequest = onDismiss
   ) {

       Column (
           modifier = Modifier
               .fillMaxWidth()
               .padding(16.dp)
       ) {




       }

   }

}
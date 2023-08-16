package com.ortega.firebase_mvvm.presentation.components.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TitleComponent(title: String) {
    
    ListItem(
        modifier = Modifier.fillMaxWidth(),
        headlineContent = { Text(text = title) },
        trailingContent = { 
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.ArrowForward, contentDescription = null)
            }
        }
    )
    
}
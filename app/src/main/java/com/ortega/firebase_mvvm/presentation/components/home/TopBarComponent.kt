package com.ortega.firebase_mvvm.presentation.components.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.ortega.firebase_mvvm.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarComponent(onClickNavigation: () -> Unit ) {

    CenterAlignedTopAppBar(
        navigationIcon = {
            IconButton(onClick = onClickNavigation) {
                Icon(imageVector = Icons.Rounded.Menu, contentDescription = null)
            }
        },
        title = {
            Text(text = stringResource(R.string.home))
        }
    )

}
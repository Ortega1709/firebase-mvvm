package com.ortega.firebase_mvvm.presentation.components.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.House
import androidx.compose.material3.DismissibleNavigationDrawer
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ortega.firebase_mvvm.R

@Composable
fun DrawerComponent(drawerState: DrawerState) {


    DismissibleNavigationDrawer(
        drawerState = DrawerState(
            initialValue = drawerState.currentValue,
            confirmStateChange = { true }
        ),
        drawerContent = {
            Column (
                modifier = Modifier
                    .width(300.dp)
                    .fillMaxHeight()
                    .background(MaterialTheme.colorScheme.background)
            ) {

                ListItem(
                    leadingContent = { Icon(imageVector = Icons.Rounded.House, contentDescription = null) },
                    headlineContent = { Text(text = stringResource(id = R.string.home)) }
                )

            }
        }
    ) {

    }

}
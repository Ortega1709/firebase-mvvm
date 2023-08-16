package com.ortega.firebase_mvvm.presentation.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ortega.firebase_mvvm.presentation.components.ui.ImageSlider

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ImageSliderScreen() {

    val images = remember {
        mutableStateListOf(
            "https://pbs.twimg.com/media/FvUVt3hXgAAxP1H?format=jpg&name=900x900",
            "https://fr.web.img2.acsta.net/pictures/23/05/11/10/00/1986933.jpg",
            "https://fr.web.img6.acsta.net/pictures/23/03/13/10/44/5295339.jpg",
            "https://t2.gstatic.com/licensed-image?q=tbn:ANd9GcSSDVNxwxrUfMiKUtgJRVRyNtXVTRXW8sTzajx02GEELXvhtjI0XUvSaBfN420iApld",
            "https://fr.web.img3.acsta.net/pictures/16/10/11/09/32/205295.jpg",
        )
    }

    Scaffold {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 48.dp)
        ) {
            
            ImageSlider(images = images)

        }
    }

}
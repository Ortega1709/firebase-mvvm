package com.ortega.firebase_mvvm.presentation.main

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.ortega.firebase_mvvm.R
import com.ortega.firebase_mvvm.domain.model.Movie
import com.ortega.firebase_mvvm.presentation.components.main.BottomSheetComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: MainViewModel = hiltViewModel()) {

    val context = LocalContext.current
    val uiState = viewModel.uiState

    var showBottomSheet by rememberSaveable { mutableStateOf(false) }
    var titleField  by rememberSaveable { mutableStateOf("") }
    var categoryField  by rememberSaveable { mutableStateOf("") }
    var imageField  by rememberSaveable { mutableStateOf("") }



    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.movies)) },
                actions = {
                    IconButton(onClick = { showBottomSheet = true }) {
                        Icon(imageVector = Icons.Rounded.Add, contentDescription = null)
                    }
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(horizontal = 16.dp)
        ) {
            
            LazyColumn {
                items(uiState.list) {
                    Card (
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        
                        ListItem(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(color = Color.Transparent),
                            leadingContent = {
                               AsyncImage(
                                   modifier = Modifier
                                       .width(90.dp)
                                       .height(150.dp)
                                       .clip(RoundedCornerShape(16.dp)),
                                   model = it.image,
                                   contentScale = ContentScale.Crop,
                                   contentDescription = null
                               )              
                            },
                            headlineContent = { Text(text = it.title) },
                            supportingContent = { Text(text = it.category) }
                        )
                        
                    }
                    
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }

        }
    }

    if (showBottomSheet) {
        BottomSheetComponent(
            onDismiss = { showBottomSheet = false },
            titleField = titleField,
            categoryField = categoryField,
            imageField = imageField,
            onTitleChange = { titleField = it },
            onCategoryChange = { categoryField = it},
            onImageChange = { imageField = it},
            onClickSave = {

                val movie = Movie(
                    title = titleField, category = categoryField, image = imageField
                )
                viewModel.saveMovie(movie)
                showBottomSheet = false

                viewModel.getAllMovies()

            }
        )
    }

}
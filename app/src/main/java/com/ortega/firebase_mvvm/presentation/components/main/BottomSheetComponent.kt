package com.ortega.firebase_mvvm.presentation.components.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ortega.firebase_mvvm.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetComponent(
    onDismiss: () -> Unit,
    titleField: String,
    categoryField: String,
    imageField: String,
    onTitleChange: (String) -> Unit,
    onCategoryChange: (String) -> Unit,
    onImageChange: (String) -> Unit,
    onClickSave: () -> Unit
) {


    var title by rememberSaveable { mutableStateOf(titleField) }
    var category by rememberSaveable { mutableStateOf(categoryField) }
    var image by rememberSaveable { mutableStateOf(imageField) }


    ModalBottomSheet(
        onDismissRequest = onDismiss
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            OutlinedTextField(
                label = { Text(text = stringResource(R.string.title)) },
                modifier = Modifier.fillMaxWidth(),
                value = title,
                onValueChange = {
                    title = it
                    onTitleChange(it)
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                label = { Text(text = stringResource(R.string.category)) },
                modifier = Modifier.fillMaxWidth(),
                value = category,
                onValueChange = {
                    category = it
                    onCategoryChange(it)
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                label = { Text(text = stringResource(R.string.image)) },
                modifier = Modifier.fillMaxWidth(),
                value = image,
                onValueChange = {
                    image = it
                    onImageChange(it)
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                onClick = onClickSave
            ) {
                Text(text = stringResource(R.string.save))
            }

        }

    }

}
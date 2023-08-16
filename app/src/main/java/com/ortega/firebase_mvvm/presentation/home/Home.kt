package com.ortega.firebase_mvvm.presentation.home

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.view.WindowInsets
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ortega.firebase_mvvm.R
import com.ortega.firebase_mvvm.domain.model.popularPhones
import com.ortega.firebase_mvvm.domain.model.recommendedPhones
import com.ortega.firebase_mvvm.presentation.components.home.CarouselComponent
import com.ortega.firebase_mvvm.presentation.components.home.DrawerComponent
import com.ortega.firebase_mvvm.presentation.components.home.GridPhoneComponent
import com.ortega.firebase_mvvm.presentation.components.home.ItemPhoneComponent
import com.ortega.firebase_mvvm.presentation.components.home.TitleComponent
import com.ortega.firebase_mvvm.presentation.components.home.TopBarComponent
import com.ortega.firebase_mvvm.presentation.theme.FirebasemvvmTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {



    Scaffold (
        topBar = { TopBarComponent(onClickNavigation = {

        }) }
    ) { paddingValues ->

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
        ) {

            Spacer(modifier = Modifier.height(8.dp))

            CarouselComponent()

            TitleComponent(title = stringResource(id = R.string.popular))

            LazyRow {
                item {
                    Spacer(modifier = Modifier.width(16.dp))
                }
                
                items(popularPhones) {
                    GridPhoneComponent(phone = it)
                }

                item {
                    Spacer(modifier = Modifier.width(16.dp))
                }
            }

            TitleComponent(title = stringResource(R.string.recommend))

            Column {
                recommendedPhones.map { 
                    ItemPhoneComponent(phone = it)
                }
            }

        }

    }
}










@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun HomePreview() {
    FirebasemvvmTheme {
        Home()
    }
}
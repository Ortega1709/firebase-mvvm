package com.ortega.firebase_mvvm.presentation.components.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ortega.firebase_mvvm.R
import com.ortega.firebase_mvvm.presentation.theme.FirebasemvvmTheme

@Composable
fun CarouselComponent() {

    Column (
        modifier = Modifier.fillMaxWidth()
    ) {


        Image (
            painter = painterResource(id = R.drawable.promo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(horizontal = 16.dp)
                .clip(RoundedCornerShape(16.dp))
        )

        Spacer(modifier = Modifier.height(16.dp))
        IndicatorComponent()

    }

}


@Preview
@Composable
fun CarouselComponentPreview() {
    FirebasemvvmTheme {
        CarouselComponent()
    }
}
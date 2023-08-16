package com.ortega.firebase_mvvm.presentation.components.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ortega.firebase_mvvm.domain.model.Phone
import com.ortega.firebase_mvvm.presentation.theme.FirebasemvvmTheme

@Composable
fun GridPhoneComponent(phone: Phone) {

    val maxSize = 170.dp
    
    Column (
        modifier = Modifier.padding(end = 16.dp)
    ) {

        Image(
            modifier = Modifier
                .width(maxSize)
                .height(120.dp)
                .clip(RoundedCornerShape(16.dp)),
            painter = painterResource(id = phone.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        ListItem(
            modifier = Modifier.widthIn(max = maxSize),
            headlineContent = { Text(text = phone.model, overflow = TextOverflow.Ellipsis, maxLines = 1) },
            supportingContent = { Text(text = phone.price) }
        )
    }

}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GridPhoneComponentPreview() {
    FirebasemvvmTheme {

    }
}
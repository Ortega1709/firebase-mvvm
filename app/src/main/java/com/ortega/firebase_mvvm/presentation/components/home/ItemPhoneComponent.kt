package com.ortega.firebase_mvvm.presentation.components.home

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun ItemPhoneComponent(phone: Phone) {

    ListItem(
        leadingContent = {
           Image(
               painter = painterResource(id = phone.image),
               contentDescription = null,
               contentScale = ContentScale.Crop,
               modifier = Modifier
                   .size(70.dp)
                   .clip(RoundedCornerShape(16.dp))
                   .background(Color.LightGray)
           )
        },
        headlineContent = { Text(text = phone.model, overflow = TextOverflow.Ellipsis) },
        supportingContent = { Text(text = phone.price) }
    )

}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun ItemPhoneComponentPreview() {
    FirebasemvvmTheme {
    }
}
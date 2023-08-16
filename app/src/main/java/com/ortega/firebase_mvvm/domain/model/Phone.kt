package com.ortega.firebase_mvvm.domain.model

import androidx.compose.foundation.Image
import com.ortega.firebase_mvvm.R

data class Phone (
    val id: Int?,
    val marque: String,
    val model: String,
    val price: String,
    val description: String,
    val image: Int
)

val popularPhones = listOf(
    Phone(null, "Samsung", "Galaxy s22 Ultra", "1.600.000 fc", "", R.drawable.samsung_s22_ultra),
    Phone(null, "Apple", "Iphone 14 Pro max", "2.600.000 fc", "", R.drawable.iphone_14_pro_max),
    Phone(null, "Oppo", "Find X", "1.900.000 fc", "", R.drawable.oppo_find),
    Phone(null, "Google", "Pixel 7 Pro", "1.500.000 fc", "", R.drawable.pixel_7_pro),
    Phone(null, "Xiaomi", "Xiaomi 12 Pro", "1.200.000 fc", "", R.drawable.xiaomi_12_pro),
)

val recommendedPhones = listOf(
    Phone(null, "Apple", "Iphone XR", "800.000 fc", "", R.drawable.iphone_xr),
    Phone(null, "Samsung", "Galaxy Note 7", "450.000 fc", "", R.drawable.samsung_note_7),
    Phone(null, "Tecno", "Camon 20 Pro", "300.000 fc", "", R.drawable.camon_20_pro),
    Phone(null, "Samsung", "Galaxy Note 10", "650.000 fc", "", R.drawable.samsung_note_10),
    Phone(null, "Samsung", "Galaxy s23", "2.200.000 fc", "", R.drawable.samsung_s23),
    Phone(null, "Samsung", "Galaxy z flip", "3.000.000 fc", "", R.drawable.galaxy_z_flip),
    Phone(null, "Samsung", "Galaxy A 34", "540.000 fc", "", R.drawable.galaxy_a_34),
)
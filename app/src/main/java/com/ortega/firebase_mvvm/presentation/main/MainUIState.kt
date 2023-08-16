package com.ortega.firebase_mvvm.presentation.main

import com.ortega.firebase_mvvm.domain.model.Movie

data class MainUIState(
    val isLoading: Boolean = false,
    val list: List<Movie> = emptyList(),
    val error: String? = null
)
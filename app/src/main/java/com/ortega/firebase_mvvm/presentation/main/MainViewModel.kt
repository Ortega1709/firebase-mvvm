package com.ortega.firebase_mvvm.presentation.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ortega.firebase_mvvm.data.repository.MovieRepository
import com.ortega.firebase_mvvm.domain.model.Movie
import com.ortega.firebase_mvvm.util.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val movieRepository: MovieRepository): ViewModel() {

    var uiState by mutableStateOf(MainUIState())

    init { getAllMovies() }

    fun getAllMovies() {
        viewModelScope.launch {

            movieRepository.getAllMovies().collect {
                uiState = when(it) {
                    is Result.Loading -> {
                        uiState.copy(isLoading = true)
                    }

                    is Result.Success -> {
                        uiState.copy(isLoading = false, list = it.data!!)
                    }

                    is Result.Error -> {
                        uiState.copy(isLoading = false, error = it.message!!)
                    }
                }
            }

        }
    }

    fun saveMovie(movie: Movie) {

        viewModelScope.launch {

            movieRepository.saveMovie(movie).collect {
                uiState = when(it) {
                    is Result.Loading -> {
                        uiState.copy(isLoading = true)
                    }

                    is Result.Success -> {
                        uiState.copy(isLoading = false, error = it.message!!)
                    }

                    is Result.Error -> {
                        uiState.copy(isLoading = false, error = it.message!!)
                    }
                }
            }

        }

    }

}
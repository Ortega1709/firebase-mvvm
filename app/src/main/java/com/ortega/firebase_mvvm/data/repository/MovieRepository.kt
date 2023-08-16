package com.ortega.firebase_mvvm.data.repository

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.ortega.firebase_mvvm.data.datasource.remote.FireStoreInstance
import com.ortega.firebase_mvvm.domain.model.Movie
import com.ortega.firebase_mvvm.util.Constants.MOVIES_COLLECTION
import com.ortega.firebase_mvvm.util.Result
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class MovieRepository {

    private val fireStore = Firebase.firestore
    private val moviesCollection = fireStore.collection(MOVIES_COLLECTION)

    fun getAllMovies() = flow {
        emit(Result.Loading())

        val movies = moviesCollection.get().await().documents
            .map {
                Movie(
                    id = it.id,
                    title = it.getString("title") ?: "",
                    category = it.getString("category") ?: "",
                    image = it.getString("image") ?: ""
                )
            }

        emit(Result.Success(data = movies, message = null))
    }.catch {
        emit(Result.Error(message = it.message.toString()))
    }

    fun saveMovie(movie: Movie) = flow {
        emit(Result.Loading())
        var success = false

        moviesCollection.add(movie)
            .addOnSuccessListener {
                success = true
            }
            .addOnFailureListener {
                success = false
            }

        if (success)
            emit(Result.Success(data = null, message = "New record"))
        else
            emit(Result.Error(message = "Error record"))

    }.catch {
        emit(Result.Error(message = it.message.toString()))
    }



}
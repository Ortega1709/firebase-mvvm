package com.ortega.firebase_mvvm.di

import com.google.firebase.firestore.FirebaseFirestore
import com.ortega.firebase_mvvm.data.datasource.remote.FireStoreInstance
import com.ortega.firebase_mvvm.data.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideMovieRepository(): MovieRepository {
        return MovieRepository()
    }



}
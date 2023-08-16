package com.ortega.firebase_mvvm.util

sealed class Result<T> (val data: T?=null, val message: String?=null) {

    class Success<T>(data: T?, message: String?): Result<T>(data = data, message = message)
    class Error<T>(message: String): Result<T>(message = message)
    class Loading<T>(): Result<T>()

}
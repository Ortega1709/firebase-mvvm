package com.ortega.firebase_mvvm.data.datasource.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FireStoreInstance (
    val database: FirebaseFirestore = Firebase.firestore
)
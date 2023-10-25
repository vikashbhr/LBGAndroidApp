package com.example.lbgandroidapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private val  repository: MyRepository): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java))
            return MainActivityViewModel(repository) as T

        throw IllegalArgumentException("UNKNOWN VIEW MODEL CLASS")
    }
}
package com.example.lbgandroidapp

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel(private val repository: MyRepository) : ViewModel() {

    fun getMovies():MutableLiveData<ArrayList<MovieModel>> {
        val products: MutableLiveData<ArrayList<MovieModel>> = MutableLiveData()
        viewModelScope.launch(Dispatchers.IO) {

            val response = repository.getMovies()

            Log.e("Response", response.body().toString())
            products.postValue(response.body())
        }

        return products
    }
}
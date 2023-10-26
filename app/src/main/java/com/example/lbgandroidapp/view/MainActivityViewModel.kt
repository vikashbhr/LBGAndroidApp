package com.example.lbgandroidapp.view

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lbgandroidapp.data.model.MovieModel
import com.example.lbgandroidapp.data.domain.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor (private val repository: MovieRepository) : ViewModel() {

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
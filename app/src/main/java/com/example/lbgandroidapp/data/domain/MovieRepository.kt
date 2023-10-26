package com.example.lbgandroidapp.data.domain

import com.example.lbgandroidapp.data.RetrofitInstance
import com.example.lbgandroidapp.data.remote.MovieServices

class MovieRepository {

    private val movieServices = RetrofitInstance.retrofitInstance().create(MovieServices::class.java)

    suspend fun getMovies() = movieServices.movies()


}
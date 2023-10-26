package com.example.lbgandroidapp.data.remote

import com.example.lbgandroidapp.data.model.MovieModel
import retrofit2.Response
import retrofit2.http.GET

interface MovieServices {

    @GET("movies")
    suspend fun movies(): Response<ArrayList<MovieModel>>
}
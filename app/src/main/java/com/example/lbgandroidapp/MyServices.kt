package com.example.lbgandroidapp

import retrofit2.Response
import retrofit2.http.GET

interface MyServices {

    @GET("movies")
    suspend fun movies(): Response<ArrayList<MovieModel>>
}
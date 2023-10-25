package com.example.lbgandroidapp

class MyRepository {

    private val myServices = RetrofitInstance.retrofitInstance().create(MyServices::class.java)

    suspend fun getMovies() = myServices.movies()


}
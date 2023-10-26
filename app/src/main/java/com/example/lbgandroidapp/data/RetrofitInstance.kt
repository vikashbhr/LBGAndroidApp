package com.example.lbgandroidapp.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object{
        private const val BASE_URL = "https://my-json-server.typicode.com/horizon-code-academy/fake-movies-api/"
        fun retrofitInstance(): Retrofit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
package com.example.lbgandroidapp.data.remote


import com.example.lbgandroidapp.data.model.MovieModel


class FakeMovieRepository{

    private val movies = mutableListOf<MovieModel>()

    init {
        movies.add(MovieModel("Poster1", "120", "title1", "2022"))
        movies.add(MovieModel("Poster2", "121", "title2", "2023"))
    }
    fun movies(): List<MovieModel> {
        return movies
    }
}
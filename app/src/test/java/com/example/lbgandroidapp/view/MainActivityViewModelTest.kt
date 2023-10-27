package com.example.lbgandroidapp.view

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.lbgandroidapp.data.model.MovieModel
import com.example.lbgandroidapp.data.remote.FakeMovieRepository
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityViewModelTest{

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var movieModel: MovieModel

    @Before
    fun setUp(){
        val fakeMovieRepository = FakeMovieRepository()
        val getMovies = fakeMovieRepository.movies()
        //val viewModel = MainActivityViewModel(fakeMovieRepository)
    }


}
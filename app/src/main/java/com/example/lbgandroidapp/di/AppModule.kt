package com.example.lbgandroidapp.di

import com.example.lbgandroidapp.view.MainActivityViewModel
import com.example.lbgandroidapp.data.domain.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideMyRepository(): MovieRepository {
        return MovieRepository()
    }
    @Provides
    fun provideMainActivityViewModel(repository: MovieRepository): MainActivityViewModel {
        return MainActivityViewModel(repository)
    }

}
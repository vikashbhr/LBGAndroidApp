package com.example.lbgandroidapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LBGApp(): Application() {

    override fun onCreate() {
        super.onCreate()
    }
}
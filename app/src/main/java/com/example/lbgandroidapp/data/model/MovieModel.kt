package com.example.lbgandroidapp.data.model


import com.google.gson.annotations.SerializedName

data class MovieModel(
    @SerializedName("Poster")
    val poster: String?,
    @SerializedName("Runtime")
    val runtime: String?,
    @SerializedName("Title")
    val title: String?,
    @SerializedName("Year")
    val year: String?
)
package com.example.movieworld.services

import com.example.movieworld.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApilnterface {
    @GET("/3/movie/popular?api_key=d2197d7fdc567c348464975c16c3beb8")
            fun getMovieList(): Call<MovieResponse>
}
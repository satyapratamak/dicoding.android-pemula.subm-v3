package com.satya.subm.submission.data.remote

import androidx.room.Query
import com.satya.subm.submission.BuildConfig
import retrofit2.http.GET

interface MovieAPI {

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val API_KEY = BuildConfig.MOVIEDB_API_KEY
    }

    @GET("movie/now_playing?api_key=$API_KEY")
    suspend fun getNowPlayingMovies(
        @Query("page") position: Int
    ) : MovieResponse {

    }
}
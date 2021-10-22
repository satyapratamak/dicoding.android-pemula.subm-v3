package com.satya.subm.submission.data.remote

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor(private val movieAPI: MovieAPI) {
}
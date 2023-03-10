package com.example.MFuadi.models

data class PopularMovies(
    val result: List<Result>
)

data class Result(
    val id:Int, val overview: String,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val vote_average: Double,
    val vote_count: Int
)
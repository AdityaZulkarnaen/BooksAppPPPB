package com.example.booksapp

import com.example.booksapp.data.BooksResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GoogleBooksApi {
    @GET("volumes")
    suspend fun searchVolumes(
        @Query("q") query: String,
        @Query("maxResults") maxResults: Int = 20
    ): BooksResponse
}
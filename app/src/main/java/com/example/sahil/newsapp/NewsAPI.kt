package com.example.sahil.newsapp

import com.example.sahil.googlenews.bean.Articles
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {


    @GET("v2/top-headlines")
    abstract fun getNews(

            @Query("country") country: String,
            @Query("apiKey") apiKey: String

    ): Call<Articles>


    @GET("v2/top-headlines")
    abstract fun getCategory(

            @Query("country") country: String,
            @Query("category") category:String,
            @Query("apiKey") apiKey: String

    ): Call<Articles>

    @GET("v2/top-headlines")
    abstract fun getSource(

            @Query("sources") sr: String,
            @Query("apiKey") apiKey: String

    ): Call<Articles>

    @GET("v2/top-headlines")
    abstract fun getTopHeadline(

            @Query("category") cat: String,
            @Query("apiKey") apiKey: String

    ): Call<Articles>
}


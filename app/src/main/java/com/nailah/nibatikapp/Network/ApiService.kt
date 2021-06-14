package com.nailah.nibatikapp.Network

import com.nailah.nibatikapp.model.AllResponse
import com.nailah.nibatikapp.model.PopularResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("all")
    fun getAllBatik(
        @Query("page")page: Int
    ): retrofit2.Call<AllResponse>

    @GET("popular")
    fun getPopular(
        @Query("page")page: Int
    ): retrofit2.Call<PopularResponse>
}
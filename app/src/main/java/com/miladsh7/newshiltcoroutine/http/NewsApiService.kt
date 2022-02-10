package com.miladsh7.newshiltcoroutine.http


import com.miladsh7.newshiltcoroutine.models.ResponseModel
import kotlinx.coroutines.delay
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("everything")
    suspend fun getBitcoin (@Query("page") page: Int,
                    @Query("pageSize") pageSize: Int,
                    @Query("q") q:String,
                    @Query("apiKey") apikey: String): Response<ResponseModel>




}
package com.miladsh7.newshiltcoroutine.repo

import com.miladsh7.newshiltcoroutine.helper.Constant
import com.miladsh7.newshiltcoroutine.http.NewsApiService
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsApiService: NewsApiService) {

    suspend fun getBitcoin() =
        newsApiService.getBitcoin(Constant.page,Constant.pageSize,Constant.q,Constant.API_KEY)
}
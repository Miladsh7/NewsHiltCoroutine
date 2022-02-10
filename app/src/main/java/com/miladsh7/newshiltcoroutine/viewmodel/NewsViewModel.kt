package com.miladsh7.newshiltcoroutine.viewmodel

import com.miladsh7.newshiltcoroutine.models.ResponseModel
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.miladsh7.newshiltcoroutine.models.Article
import com.miladsh7.newshiltcoroutine.repo.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor (private val newsRepository: NewsRepository):ViewModel() {

    private val _response = MutableLiveData<ResponseModel>()
    val responseNews:  LiveData<ResponseModel>
    get() = _response

    init {
        getAllNews()
    }

    private fun getAllNews () = viewModelScope.launch {
        newsRepository.getBitcoin().let {response ->  
            if (response.body()?.status.equals("ok")){
                _response.postValue(response.body())

            }else{
                Log.e("NewsViewModel","getNews error : ${response.errorBody()}")
            }
        }
    }
}





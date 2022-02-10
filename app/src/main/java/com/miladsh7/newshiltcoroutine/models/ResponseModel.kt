package com.miladsh7.newshiltcoroutine.models


import android.os.Parcelable
import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Entity(tableName = "news_todo")
data class ResponseModel(

    @SerializedName("source")
    var source: Source?,

    @SerializedName("status")
    var status:String,

    @SerializedName("totalResults")
     var totalResults:Int,

    @SerializedName("articles")
     var articles:List<Article>?

)
package com.miladsh7.newshiltcoroutine.models

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Source(
    @SerializedName("id")
    @Expose
    var id :String?,

    @SerializedName("name")
    @Expose
    var name: String?

):Parcelable
package com.example.movieworld.models
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
@Parcelize
data  class Movie (
    @SerializedName("name")
    val  id : String?,

    @SerializedName("title")
    val title:String?,
    @SerializedName("poster_path")
    val poster :String?,
    @SerializedName("release_date")
    val  release :String?

        ): Parcelable{
            constructor():this("", "","","")



        }




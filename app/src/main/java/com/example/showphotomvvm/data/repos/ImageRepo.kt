package com.example.showphotomvvm.data.repos

import android.util.Log
import com.example.showphotomvvm.data.api.Client
import com.example.showphotomvvm.data.model.ImagesModel
import retrofit2.Response

object ImageRepo {
    suspend fun getAllImage(): Response<List<ImagesModel>> {
        val temp = Client.api.getImages()
        Log.i("working NewsRepo","$temp")
        return  temp
    }
}
package com.example.showphotomvvm.data.api

import com.example.showphotomvvm.data.model.ImagesModel
import retrofit2.Response
import retrofit2.http.GET

interface ImageServices {
    @GET("photos")
    suspend fun getImages():Response<List<ImagesModel>>
}

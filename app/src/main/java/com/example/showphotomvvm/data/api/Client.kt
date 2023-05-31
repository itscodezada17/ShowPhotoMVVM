package com.example.showphotomvvm.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.xml.parsers.FactoryConfigurationError

object Client {
    private val retrofit = Retrofit.Builder()
                            .baseUrl("https://jsonplaceholder.typicode.com/")
                             .addConverterFactory(GsonConverterFactory.create())
                            .build()
    val api = retrofit.create(ImageServices::class.java)
}
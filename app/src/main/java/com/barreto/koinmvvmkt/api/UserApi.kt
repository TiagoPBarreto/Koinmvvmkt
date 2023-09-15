package com.barreto.koinmvvmkt.api

import com.barreto.koinmvvmkt.model.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UserApi {

    @GET("/users")
    suspend fun getAllUsers():List<User>

}
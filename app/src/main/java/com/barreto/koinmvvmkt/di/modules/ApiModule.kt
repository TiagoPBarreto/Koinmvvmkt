package com.barreto.koinmvvmkt.di.modules

import com.barreto.koinmvvmkt.api.UserApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module{

    single {
        providerUserApi()
    }

}

fun providerUserApi() : UserApi {
    return Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(UserApi::class.java)
}

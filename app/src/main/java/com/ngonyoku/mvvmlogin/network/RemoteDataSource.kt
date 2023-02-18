package com.ngonyoku.mvvmlogin.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteDataSource {
    companion object {
        private const val BASE_URL = "http://139.162.236.74:8081"
    }

    fun <Api> buildApi(api: Class<Api>): Api {
        //Build the Api interface
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }
}
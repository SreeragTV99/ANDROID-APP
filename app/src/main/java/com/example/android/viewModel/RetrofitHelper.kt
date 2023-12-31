package com.example.android.viewModel

import com.example.android.Constants.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {
    fun getQuotesInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL_QUOTES)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
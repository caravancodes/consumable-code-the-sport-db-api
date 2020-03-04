package com.frogobox.frogothesportdbapi.data.source

import com.frogobox.frogothesportdbapi.BuildConfig
import com.frogobox.frogothesportdbapi.data.response.Teams
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 26/01/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothesportdbapi.source
 *
 */

interface SportApiService {

    @GET(BuildConfig.SPORTDB_URL_SEARCH_ALL_TEAMS)
    fun searchTeamByLeague(
        @Path(BuildConfig.PATH_API_KEY) apiKey: String,
        @Query(BuildConfig.QUERY_LEAGUE) league: String
    ): Observable<Teams>

    companion object Factory {

        val getApiService: SportApiService by lazy {
            val mLoggingInterceptor = HttpLoggingInterceptor()
            mLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val cacheSize = (5 * 1024 * 1024).toLong()
            val mClient = if (BuildConfig.DEBUG) {
                OkHttpClient.Builder()
//                    .addInterceptor(ChuckInterceptor(BaseApplication.getContext()))
                    .addInterceptor(mLoggingInterceptor)
//                    .addInterceptor(ChuckInterceptor(BaseApplication.getContext()))
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build()
            } else {
                OkHttpClient.Builder()
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build()
            }

            val mRetrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.SPORTDB_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(mClient)
                .build()

            mRetrofit.create(SportApiService::class.java)
        }
    }

}
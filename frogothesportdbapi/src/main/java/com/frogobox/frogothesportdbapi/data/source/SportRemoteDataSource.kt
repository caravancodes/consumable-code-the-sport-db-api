package com.frogobox.frogothesportdbapi.data.source

import android.content.Context
import com.frogobox.frogothesportdbapi.data.response.Players
import com.frogobox.frogothesportdbapi.data.response.Teams
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


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
object SportRemoteDataSource :
    SportDataSource {
    
    val sportApiService = SportApiService
    
    fun usingChuckInterceptor(context: Context){
        sportApiService.usingChuckInterceptor(context)
    }
    
    override fun searchForTeamByName(
        apiKey: String,
        teamName: String,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        sportApiService.getApiService
            .searchForTeamByName(apiKey, teamName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SportApiCallback<Teams>() {
                override fun onSuccess(model: Teams) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForTeamByShortCode(
        apiKey: String,
        shortCode: String,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        sportApiService.getApiService
            .searchForTeamByShortCode(apiKey, shortCode)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SportApiCallback<Teams>() {
                override fun onSuccess(model: Teams) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForAllPlayerFromTeam(
        apiKey: String,
        teamName: String,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        sportApiService.getApiService
            .searchForAllPlayerFromTeam(apiKey, teamName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SportApiCallback<Players>() {
                override fun onSuccess(model: Players) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForPlayerByName(
        apiKey: String,
        playerName: String,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        sportApiService.getApiService
            .searchForPlayerByName(apiKey, playerName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SportApiCallback<Players>() {
                override fun onSuccess(model: Players) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForPlayerByPlayerNameAndTeamName(
        apiKey: String,
        teamName: String,
        playerName: String,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        sportApiService.getApiService
            .searchForPlayerByPlayerNameAndTeamName(apiKey, teamName, playerName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SportApiCallback<Players>() {
                override fun onSuccess(model: Players) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchAllTeamByLeague(
        apiKey: String,
        league: String,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        sportApiService.getApiService
            .searchAllTeamByLeague(apiKey, league)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SportApiCallback<Teams>() {
                override fun onSuccess(model: Teams) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

}
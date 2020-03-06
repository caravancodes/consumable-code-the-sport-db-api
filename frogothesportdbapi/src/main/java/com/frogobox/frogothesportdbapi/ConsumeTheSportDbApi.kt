package com.frogobox.frogothesportdbapi

import android.content.Context
import com.frogobox.frogothesportdbapi.callback.SportResultCallback
import com.frogobox.frogothesportdbapi.data.response.Events
import com.frogobox.frogothesportdbapi.data.response.Players
import com.frogobox.frogothesportdbapi.data.response.Teams
import com.frogobox.frogothesportdbapi.data.source.SportDataSource
import com.frogobox.frogothesportdbapi.data.source.SportRemoteDataSource
import com.frogobox.frogothesportdbapi.data.source.SportRepository

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 04/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothesportdbapi
 *
 */
class ConsumeTheSportDbApi(private val apiKey: String) : ConsumeTheSportDbApiView {

    private val sportRepository = SportRepository(SportRemoteDataSource)

    override fun usingChuckInterceptor(context: Context) {
        sportRepository.usingChuckInterceptor(context)
    }

    override fun searchForTeamByName(
        teamName: String,
        sportResultCallback: SportResultCallback<Teams>
    ) {
        sportRepository.searchForTeamByName(
            apiKey,
            teamName,
            object : SportDataSource.GetRemoteCallback<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun searchForTeamByShortCode(
        shortCode: String,
        sportResultCallback: SportResultCallback<Teams>
    ) {
        sportRepository.searchForTeamByName(
            apiKey,
            shortCode,
            object : SportDataSource.GetRemoteCallback<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun searchForAllPlayer(
        teamName: String,
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.searchForAllPlayer(
            apiKey,
            teamName,
            object : SportDataSource.GetRemoteCallback<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun searchForPlayer(
        playerName: String,
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.searchForPlayer(
            apiKey,
            playerName,
            object : SportDataSource.GetRemoteCallback<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun searchForPlayer(
        teamName: String,
        playerName: String,
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.searchForPlayer(
            apiKey,
            teamName,
            playerName,
            object : SportDataSource.GetRemoteCallback<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun searchForEvent(
        eventName: String,
        sportResultCallback: SportResultCallback<Events>
    ) {
        sportRepository.searchForEvent(
            apiKey,
            eventName,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun searchForEvent(
        eventName: String,
        season: String,
        sportResultCallback: SportResultCallback<Events>
    ) {
        sportRepository.searchForEvent(
            apiKey,
            eventName,
            season,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun searchAllTeamByLeague(
        league: String,
        sportResultCallback: SportResultCallback<Teams>
    ) {

        sportRepository.searchAllTeamByLeague(
            apiKey,
            league,
            object : SportDataSource.GetRemoteCallback<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })
    }

}
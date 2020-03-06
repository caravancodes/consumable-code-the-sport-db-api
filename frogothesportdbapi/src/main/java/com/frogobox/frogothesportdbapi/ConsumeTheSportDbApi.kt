package com.frogobox.frogothesportdbapi

import android.content.Context
import com.frogobox.frogothesportdbapi.callback.SportResultCallback
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

    fun usingChuckInterceptor(context: Context) {
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

    override fun searchForAllPlayerFromTeam(
        teamName: String,
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.searchForAllPlayerFromTeam(
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

    override fun searchForPlayerByName(
        playerName: String,
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.searchForPlayerByName(
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

    override fun searchForPlayerByPlayerNameAndTeamName(
        teamName: String,
        playerName: String,
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.searchForPlayerByPlayerNameAndTeamName(
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

    override fun searchAllTeamByLeague(league: String, sportResultCallback: SportResultCallback<Teams>) {

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
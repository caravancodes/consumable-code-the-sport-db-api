package com.frogobox.frogothesportdbapi

import com.frogobox.frogothesportdbapi.callback.SportResultCallback
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

    override fun searchTeams(league: String, sportResultCallback: SportResultCallback<Teams>) {

        sportRepository.searchTeamByLeague(
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
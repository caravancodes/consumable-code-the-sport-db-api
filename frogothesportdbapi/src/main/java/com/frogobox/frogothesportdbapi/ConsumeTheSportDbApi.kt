package com.frogobox.frogothesportdbapi

import android.content.Context
import com.frogobox.frogothesportdbapi.callback.SportResultCallback
import com.frogobox.frogothesportdbapi.data.response.*
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
        sportRepository.searchForTeamByShortCode(
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
        playerName: String,
        teamName: String,
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.searchForPlayer(
            apiKey,
            playerName,
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

    override fun searchForEventFileName(
        eventFileName: String,
        sportResultCallback: SportResultCallback<Events>
    ) {

        sportRepository.searchForEventFileName(
            apiKey,
            eventFileName,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })

    }

    override fun getAllSports(sportResultCallback: SportResultCallback<Sports>) {
        sportRepository.getAllSports(apiKey, object : SportDataSource.GetRemoteCallback<Sports> {
            override fun onSuccess(data: Sports) {
                sportResultCallback.getResultData(data)
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                sportResultCallback.failedResult(statusCode, errorMessage)
            }
        })
    }

    override fun getAllLeagues(sportResultCallback: SportResultCallback<Leagues>) {
        sportRepository.getAllLeagues(apiKey, object : SportDataSource.GetRemoteCallback<Leagues> {
            override fun onSuccess(data: Leagues) {
                sportResultCallback.getResultData(data)
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                sportResultCallback.failedResult(statusCode, errorMessage)
            }
        })
    }

    override fun searchAllLeagues(
        countryName: String,
        sportResultCallback: SportResultCallback<Countrys>
    ) {
        sportRepository.searchAllLeagues(
            apiKey,
            countryName,
            object : SportDataSource.GetRemoteCallback<Countrys> {
                override fun onSuccess(data: Countrys) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun searchAllLeagues(
        countryName: String,
        sportName: String,
        sportResultCallback: SportResultCallback<Countrys>
    ) {
        sportRepository.searchAllLeagues(
            apiKey,
            countryName,
            sportName,
            object : SportDataSource.GetRemoteCallback<Countrys> {
                override fun onSuccess(data: Countrys) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun searchAllSeasons(
        idTeam: String,
        sportResultCallback: SportResultCallback<Seasons>
    ) {
        sportRepository.searchAllSeasons(
            apiKey,
            idTeam,
            object : SportDataSource.GetRemoteCallback<Seasons> {
                override fun onSuccess(data: Seasons) {
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
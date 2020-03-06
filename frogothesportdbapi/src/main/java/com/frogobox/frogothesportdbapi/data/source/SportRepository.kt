package com.frogobox.frogothesportdbapi.data.source

import android.content.Context
import com.frogobox.frogothesportdbapi.data.response.Players
import com.frogobox.frogothesportdbapi.data.response.Teams

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
open class SportRepository(private val remoteDataSource: SportRemoteDataSource) :
    SportDataSource {

    override fun usingChuckInterceptor(context: Context) {
        remoteDataSource.usingChuckInterceptor(context)
    }

    override fun searchForTeamByName(
        apiKey: String,
        teamName: String,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.searchForTeamByName(apiKey, teamName, callback)
    }

    override fun searchForTeamByShortCode(
        apiKey: String,
        shortCode: String,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.searchForTeamByShortCode(apiKey, shortCode, callback)
    }

    override fun searchForAllPlayerFromTeam(
        apiKey: String,
        teamName: String,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.searchForAllPlayerFromTeam(apiKey, teamName, callback)
    }

    override fun searchForPlayerByName(
        apiKey: String,
        playerName: String,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.searchForPlayerByName(apiKey, playerName, callback)
    }

    override fun searchForPlayerByPlayerNameAndTeamName(
        apiKey: String,
        teamName: String,
        playerName: String,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.searchForPlayerByPlayerNameAndTeamName(
            apiKey,
            teamName,
            playerName,
            callback
        )
    }

    override fun searchAllTeamByLeague(
        apiKey: String,
        league: String,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.searchAllTeamByLeague(apiKey, league, callback)
    }
}
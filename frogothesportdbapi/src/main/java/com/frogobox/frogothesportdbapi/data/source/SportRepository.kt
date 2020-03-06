package com.frogobox.frogothesportdbapi.data.source

import android.content.Context
import com.frogobox.frogothesportdbapi.data.response.*

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

    override fun searchForAllPlayer(
        apiKey: String,
        teamName: String,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.searchForAllPlayer(apiKey, teamName, callback)
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.searchForPlayer(apiKey, playerName, callback)
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String,
        teamName: String,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.searchForPlayer(
            apiKey,
            playerName,
            teamName,
            callback
        )
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.searchForEvent(apiKey, eventName, callback)
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String,
        season: String,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.searchForEvent(apiKey, eventName, season, callback)
    }

    override fun searchForEventFileName(
        apiKey: String,
        eventFileName: String,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.searchForEventFileName(apiKey, eventFileName, callback)
    }

    override fun getAllSports(apiKey: String, callback: SportDataSource.GetRemoteCallback<Sports>) {
        remoteDataSource.getAllSports(apiKey, callback)
    }

    override fun getAllLeagues(
        apiKey: String,
        callback: SportDataSource.GetRemoteCallback<Leagues>
    ) {
        remoteDataSource.getAllLeagues(apiKey, callback)
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String,
        callback: SportDataSource.GetRemoteCallback<Countrys>
    ) {
        remoteDataSource.searchAllLeagues(apiKey, countryName, callback)
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String,
        sportName: String,
        callback: SportDataSource.GetRemoteCallback<Countrys>
    ) {
        remoteDataSource.searchAllLeagues(apiKey, countryName, sportName, callback)
    }

    override fun searchAllSeasons(
        apiKey: String,
        idTeam: String,
        callback: SportDataSource.GetRemoteCallback<Seasons>
    ) {
        remoteDataSource.searchAllSeasons(apiKey, idTeam, callback)
    }

    override fun searchAllTeamByLeague(
        apiKey: String,
        league: String,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.searchAllTeamByLeague(apiKey, league, callback)
    }
}
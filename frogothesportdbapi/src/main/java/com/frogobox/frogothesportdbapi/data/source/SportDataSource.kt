package com.frogobox.frogothesportdbapi.data.source

import android.content.Context
import com.frogobox.frogothesportdbapi.base.BaseSportDataSource
import com.frogobox.frogothesportdbapi.data.response.Events
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
interface SportDataSource {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Search for team by name
    fun searchForTeamByName(apiKey: String, teamName: String, callback: GetRemoteCallback<Teams>)

    // Search for team short code
    fun searchForTeamByShortCode(apiKey: String, shortCode: String, callback: GetRemoteCallback<Teams>)

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayer(apiKey: String, teamName: String, callback: GetRemoteCallback<Players>)

    // Search for players by player name
    fun searchForPlayer(apiKey: String, playerName: String, callback: GetRemoteCallback<Players>)

    // Search for players by player name and team name
    fun searchForPlayer(apiKey: String, teamName: String, playerName: String, callback: GetRemoteCallback<Players>)

    // Search for event by event name
    fun searchForEvent(apiKey: String, eventName: String, callback: GetRemoteCallback<Events>)

    // Search For event by event name and season
    fun searchForEvent(apiKey: String, eventName: String, season: String, callback: GetRemoteCallback<Events>)

    // List all Teams in a League
    fun searchAllTeamByLeague(apiKey: String, league: String, callback: GetRemoteCallback<Teams>)

    // Response Callback
    interface GetRemoteCallback<T> : BaseSportDataSource.ResponseCallback<T>

}
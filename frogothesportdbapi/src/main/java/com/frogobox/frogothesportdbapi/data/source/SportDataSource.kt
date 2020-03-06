package com.frogobox.frogothesportdbapi.data.source

import com.frogobox.frogothesportdbapi.base.BaseSportDataSource
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

    // Search for team by name
    fun searchForTeamByName(apiKey: String, teamName: String, callback: GetRemoteCallback<Teams>)

    // Search for team short code
    fun searchForTeamByShortCode(apiKey: String, shortCode: String, callback: GetRemoteCallback<Teams>)

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayerFromTeam(apiKey: String, teamName: String, callback: GetRemoteCallback<Players>)

    // Search for players by player name
    fun searchForPlayerByName(apiKey: String, playerName: String, callback: GetRemoteCallback<Players>)

    // Search for players by player name and team name
    fun searchForPlayerByPlayerNameAndTeamName(apiKey: String, teamName: String, playerName: String, callback: GetRemoteCallback<Players>)


    // List all Teams in a League
    fun searchAllTeamByLeague(apiKey: String, league: String, callback: GetRemoteCallback<Teams>)


    // Response Callback
    interface GetRemoteCallback<T> : BaseSportDataSource.ResponseCallback<T>

}
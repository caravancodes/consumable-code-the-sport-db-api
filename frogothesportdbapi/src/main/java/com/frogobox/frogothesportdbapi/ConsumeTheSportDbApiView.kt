package com.frogobox.frogothesportdbapi

import com.frogobox.frogothesportdbapi.callback.SportResultCallback
import com.frogobox.frogothesportdbapi.data.response.Players
import com.frogobox.frogothesportdbapi.data.response.Teams

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
 * com.frogobox.frogothesportdbapi.util
 *
 */
interface ConsumeTheSportDbApiView {

    // Search for team by name
    fun searchForTeamByName(teamName: String, sportResultCallback: SportResultCallback<Teams>)

    // Search for team short code
    fun searchForTeamByShortCode(shortCode: String, sportResultCallback: SportResultCallback<Teams>)

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayerFromTeam(teamName: String, sportResultCallback: SportResultCallback<Players>)

    // Search for players by player name
    fun searchForPlayerByName(playerName: String, sportResultCallback: SportResultCallback<Players>)

    // Search for players by player name and team name
    fun searchForPlayerByPlayerNameAndTeamName(teamName: String, playerName: String, sportResultCallback: SportResultCallback<Players>)

    // List all Teams in a League
    fun searchAllTeamByLeague(league: String, sportResultCallback: SportResultCallback<Teams>)

}
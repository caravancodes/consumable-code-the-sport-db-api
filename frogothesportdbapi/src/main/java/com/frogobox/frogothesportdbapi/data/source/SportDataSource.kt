package com.frogobox.frogothesportdbapi.data.source

import com.frogobox.frogothesportdbapi.base.BaseSportDataSource
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

    fun searchForTeamByName(apiKey: String, teamName: String, callback: GetRemoteCallback<Teams>)
    fun searchForTeamByShortCode(apiKey: String, shortCode: String, callback: GetRemoteCallback<Teams>)

    fun searchTeamByLeague(apiKey: String, league: String, callback: GetRemoteCallback<Teams>)

    interface GetRemoteCallback<T> : BaseSportDataSource.ResponseCallback<T>

}
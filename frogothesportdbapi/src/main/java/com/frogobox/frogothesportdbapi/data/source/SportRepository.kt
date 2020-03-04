package com.frogobox.frogothesportdbapi.data.source

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
    override fun searchTeamByLeague(
        apiKey: String,
        league: String,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        SportRemoteDataSource.searchTeamByLeague(
            apiKey,
            league,
            callback
        )
    }
}
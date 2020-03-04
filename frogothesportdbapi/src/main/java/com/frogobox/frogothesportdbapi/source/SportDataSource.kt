package com.frogobox.frogothesportdbapi.source

import com.frogobox.frogothesportdbapi.BaseDataSource
import com.frogobox.frogothesportdbapi.response.Teams

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

    fun searchTeamByLeague(apiKey: String, league: String, callback: GetRemoteCallback<Teams>)

    interface GetRemoteCallback<T> : BaseDataSource.ResponseCallback<T>

}
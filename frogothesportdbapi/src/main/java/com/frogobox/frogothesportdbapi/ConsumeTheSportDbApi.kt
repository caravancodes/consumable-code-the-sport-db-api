package com.frogobox.frogothesportdbapi

import com.frogobox.frogothesportdbapi.response.Teams
import com.frogobox.frogothesportdbapi.source.SportDataSource
import com.frogobox.frogothesportdbapi.source.SportRemoteDataSource
import com.frogobox.frogothesportdbapi.source.SportRepository

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

    override fun searchTeams(league: String) {

        sportRepository.searchTeamByLeague(
            apiKey,
            league,
            object : SportDataSource.GetRemoteCallback<Teams> {
                override fun onSuccess(data: Teams) {

                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {

                }
            })
    }


}
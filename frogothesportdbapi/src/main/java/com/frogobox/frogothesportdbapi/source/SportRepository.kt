package com.frogobox.frogothesportdbapi.source

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
open class SportRepository(private val remoteDataSource: SportRemoteDataSource) : SportDataSource{
    override fun searchTeamByLeague(
        apiKey: String,
        league: String,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.searchTeamByLeague(apiKey, league, callback)
    }

    companion object {

        private var INSTANCE: SportRepository? = null

        /**
         * Returns the single instance of this class, creating it if necessary.

         * @param RemoteDataSource backend data source
         * *
         * @return the [Repository] instance
         */
        @JvmStatic
        fun getInstance(remoteDataSource: SportRemoteDataSource) =
            INSTANCE
                ?: synchronized(SportRepository::class.java) {
                    INSTANCE
                        ?: SportRepository(remoteDataSource)
                            .also { INSTANCE = it }
                }

        /**
         * Used to force [getInstance] to create a new instance
         * next time it's called.
         */
        @JvmStatic
        fun destroyInstance() {
            INSTANCE = null
        }
    }

}
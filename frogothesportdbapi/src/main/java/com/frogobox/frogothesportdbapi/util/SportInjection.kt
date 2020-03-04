package com.frogobox.frogothesportdbapi.util


import com.frogobox.frogothesportdbapi.source.SportRemoteDataSource
import com.frogobox.frogothesportdbapi.source.SportRepository

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * mvvm
 * Copyright (C) 16/11/2019.
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
object SportInjection {

    fun provideRepository(): SportRepository {
        return SportRepository.getInstance(SportRemoteDataSource)
    }

}
package com.frogobox.frogothesportdbapi.model

import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Sport.ID_SPORT
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Sport.STR_FORMAT
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Sport.STR_SPORT
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Sport.STR_SPORT_DESCRIPTION
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Sport.STR_SPORT_THUMB
import com.google.gson.annotations.SerializedName

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
 * com.frogobox.frogothesportdbapi.model.data
 *
 */

data class Sport(

    @SerializedName(ID_SPORT)
    var idSport: String? = null,

    @SerializedName(STR_SPORT)
    var strSport: String? = null,

    @SerializedName(STR_FORMAT)
    var strFormat: String? = null,

    @SerializedName(STR_SPORT_THUMB)
    var strSportThumb: String? = null,

    @SerializedName(STR_SPORT_DESCRIPTION)
    var strSportDescription: String? = null

)
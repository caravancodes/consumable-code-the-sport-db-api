package com.frogobox.frogothesportdbapi.data.model

import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Contract.ID
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Contract.ID_PLAYER
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Contract.ID_TEAM
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Contract.STR_PLAYER
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Contract.STR_SPORT
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Contract.STR_TEAM
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Contract.STR_TEAM_BADGE
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Contract.STR_WAGE
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Contract.STR_YEAR_END
import com.frogobox.frogothesportdbapi.util.SportConstDataApi.Contract.STR_YEAR_START
import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 08/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothesportdbapi.data.model
 *
 */
data class Contract(

    @SerializedName(ID)
    var id: String? = null,

    @SerializedName(ID_PLAYER)
    var idPlayer: String? = null,

    @SerializedName(ID_TEAM)
    var idTeam: String? = null,

    @SerializedName(STR_SPORT)
    var strSport: String? = null,

    @SerializedName(STR_PLAYER)
    var strPlayer: String? = null,

    @SerializedName(STR_TEAM)
    var strTeam: String? = null,

    @SerializedName(STR_TEAM_BADGE)
    var strTeamBadge: String? = null,

    @SerializedName(STR_YEAR_START)
    var strYearStart: String? = null,

    @SerializedName(STR_YEAR_END)
    var strYearEnd: String? = null,

    @SerializedName(STR_WAGE)
    var strWage: String? = null

)
package com.frogobox.frogothesportdbapi.util

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
 * com.frogobox.frogothesportdbapi.util
 *
 */

class ConstDataApi {

    object Sport {
        private const val URL_SPORT = "https://www.thesportsdb.com/api/v1/json/1/all_sports.php"

        const val ID_SPORT = "idSport"
        const val STR_SPORT = "strSport"
        const val STR_FORMAT = "strFormat"
        const val STR_SPORT_THUMB = "strSportThumb"
        const val STR_SPORT_DESCRIPTION = "strSportDescription"
    }

    object League {
        private const val URL_LEAGUE = "https://www.thesportsdb.com/api/v1/json/1/all_leagues.php"

        const val ID_LEAGUE = "idLeague"
        const val STR_LEAGUE = "strLeague"
        const val STR_SPORT = "strSport"
        const val STR_LEAGUE_ALTERNATE = "strLeagueAlternate"
    }

    object Country {
        private const val URL_COUNTRY = "https://www.thesportsdb.com/api/v1/json/1/search_all_leagues.php?c=England&s=Soccer"

        const val ID_LEAGUE = "idLeague"
        const val ID_SOCCEL_XML = "idSoccerXML"
        const val ID_API_FOOTBALL = "idAPIfootball"
        const val STR_SPORT = "strSport"
        const val STR_LEAGUE = "strLeague"
        const val STR_LEAGUE_ALTERNATE = "strLeagueAlternate"
        const val STR_DIVISION = "strDivision"
        const val ID_CUP = "idCup"
        const val INT_FORMED_YEAR = "intFormedYear"
        const val DATE_FIRST_EVENT = "dateFirstEvent"
        const val STR_GENDER = "strGender"
        const val STR_COUNTRY = "strCountry"
        const val STR_WEBSITE = "strWebsite"
        const val STR_FACEBOOK = "strFacebook"
        const val STR_TWITTER = "strTwitter"
        const val STR_YOUTUBE = "strYoutube"
        const val STR_RSS = "strRSS"
        const val STR_DESCRIPTION_EN = "strDescriptionEN"
        const val STR_DESCRIPTION_DE = "strDescriptionDE"
        const val STR_DESCRIPTION_FR = "strDescriptionFR"
        const val STR_DESCRIPTION_IT = "strDescriptionIT"
        const val STR_DESCRIPTION_CN = "strDescriptionCN"
        const val STR_DESCRIPTION_JP = "strDescriptionJP"
        const val STR_DESCRIPTION_RU = "strDescriptionRU"
        const val STR_DESCRIPTION_ES = "strDescriptionES"
        const val STR_DESCRIPTION_PT = "strDescriptionPT"
        const val STR_DESCRIPTION_SE = "strDescriptionSE"
        const val STR_DESCRIPTION_NL = "strDescriptionNL"
        const val STR_DESCRIPTION_HU = "strDescriptionHU"
        const val STR_DESCRIPTION_NO = "strDescriptionNO"
        const val STR_DESCRIPTION_PL = "strDescriptionPL"
        const val STR_DESCRIPTION_IL = "strDescriptionIL"
        const val STR_FANART_1 = "strFanart1"
        const val STR_FANART_2 = "strFanart2"
        const val STR_FANART_3 = "strFanart3"
        const val STR_FANART_4 = "strFanart4"
        const val STR_BANNER = "strBanner"
        const val STR_BADGE = "strBadge"
        const val STR_LOGO = "strLogo"
        const val STR_POSTER = "strPoster"
        const val STR_TROPHY = "strTrophy"
        const val STR_NAMING = "strNaming"
        const val STR_COMPLETE = "strComplete"
        const val STR_LOCKED = "strLocked"
    }

}

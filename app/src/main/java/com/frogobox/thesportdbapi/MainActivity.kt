package com.frogobox.thesportdbapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogothesportdbapi.ConsumeTheSportDbApi
import com.frogobox.frogothesportdbapi.callback.SportResultCallback
import com.frogobox.frogothesportdbapi.data.response.Players
import com.frogobox.frogothesportdbapi.data.response.Teams

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeTheSportDbApi = ConsumeTheSportDbApi("1")
        consumeTheSportDbApi.usingChuckInterceptor(this)
        consumeTheSportDbApi.searchForPlayer(
            "Danny Welbeck",
            object : SportResultCallback<Players> {
                override fun getResultData(data: Players) {
                    for (i in data.player.indices) {
                        println(data.player[i].strPlayer)
                    }
                }

                override fun failedResult(statusCode: Int, errorMessage: String?) {}

            })

        consumeTheSportDbApi.searchAllTeamByLeague(
            "English Premier League",
            object : SportResultCallback<Teams> {
                override fun getResultData(data: Teams) {
                    for (i in data.teams.indices) {
                        println(data.teams[i].strTeam)
                    }
                }

                override fun failedResult(statusCode: Int, errorMessage: String?) {}

            })

    }


}

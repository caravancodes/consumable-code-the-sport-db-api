package com.frogobox.thesportdbapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogothesportdbapi.ConsumeTheSportDbApi
import com.frogobox.frogothesportdbapi.callback.SportResultCallback
import com.frogobox.frogothesportdbapi.data.response.Teams

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeTheSportDbApi = ConsumeTheSportDbApi("1")
        consumeTheSportDbApi.searchTeams(
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

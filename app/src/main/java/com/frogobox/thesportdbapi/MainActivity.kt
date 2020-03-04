package com.frogobox.thesportdbapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.frogobox.frogothesportdbapi.ConsumeTheSportDbApi
import com.frogobox.frogothesportdbapi.response.Teams
import com.frogobox.frogothesportdbapi.source.SportDataSource
import com.frogobox.frogothesportdbapi.source.SportRemoteDataSource
import com.frogobox.frogothesportdbapi.source.SportRepository

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeTheSportDbApi = ConsumeTheSportDbApi("1")
        val searchTeams = consumeTheSportDbApi.searchTeams("English Premier League")
//
//        for (i in searchTeams.teams.indices) {
//            println(searchTeams.teams[i].strTeam)
//        }

    }




}

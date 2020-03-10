package com.frogobox.thesportdbapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogothesportdbapi.ConsumeTheSportDbApi
import com.frogobox.frogothesportdbapi.callback.SportResultCallback
import com.frogobox.frogothesportdbapi.data.response.Events
import com.frogobox.frogothesportdbapi.data.response.FormerTeams
import com.frogobox.frogothesportdbapi.data.response.Results
import com.frogobox.frogothesportdbapi.data.response.Teams

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeTheSportDbApi = ConsumeTheSportDbApi("1")
        consumeTheSportDbApi.usingChuckInterceptor(this)

        consumeTheSportDbApi.lookupFormerTeam("34147178123", object : SportResultCallback<FormerTeams>{
            override fun getResultData(data: FormerTeams) {
                if (data.formerteams != null) {
                    for (i in data.formerteams!!.indices) {
                        println(data.formerteams!![0].strPlayer)
                    }
                } else {
                    println("Is Empty Data")
                }
            }

            override fun failedResult(statusCode: Int, errorMessage: String?) {

            }
        })

    }


}

package com.frogobox.thesportdbapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogothesportdbapi.ConsumeTheSportDbApi
import com.frogobox.frogothesportdbapi.callback.SportResultCallback
import com.frogobox.frogothesportdbapi.data.response.Events
import com.frogobox.frogothesportdbapi.data.response.Results

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeTheSportDbApi = ConsumeTheSportDbApi("1")
        consumeTheSportDbApi.usingChuckInterceptor(this)

        consumeTheSportDbApi.eventsNext(
            "133602",
            object : SportResultCallback<Events> {
                override fun getResultData(data: Events) {
                    for (i in data.events.indices) {
                        println(data.events[i].strEvent)
                    }
                }

                override fun failedResult(statusCode: Int, errorMessage: String?) {}

            })

    }


}

package com.frogobox.thesportdbapi

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.frogobox.frogothesportdbapi.ConsumeTheSportDbApi
import com.frogobox.frogothesportdbapi.callback.SportResultCallback
import com.frogobox.frogothesportdbapi.data.model.Team
import com.frogobox.frogothesportdbapi.data.response.Teams
import com.frogobox.recycler.core.IFrogoViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupConsumeApi()
    }

    private fun setupConsumeApi() {
        val consumeTheSportDbApi = ConsumeTheSportDbApi("1")
        consumeTheSportDbApi.usingChuckInterceptor(this)

        consumeTheSportDbApi.searchAllTeam(
            "English Premier League",
            object : SportResultCallback<Teams> {
                override fun getResultData(data: Teams) {
                    data.teams?.let { setupFrogoRecyclerView(it) }
                }

                override fun failedResult(statusCode: Int, errorMessage: String?) {
                    // failed result
                }

                override fun onShowProgress() {
                    // showing your progress view
                    runOnUiThread {
                        progressView.visibility = View.VISIBLE
                    }
                }

                override fun onHideProgress() {
                    // hiding your progress view
                    runOnUiThread {
                        progressView.visibility = View.GONE
                    }
                }
            })
    }

    private fun setupFrogoRecyclerView(data: List<Team>) {
        frogorecyclerview.injector<Team>()
            .addData(data)
            .addCustomView(R.layout.frogo_rv_grid_type_3)
            .addEmptyView(null)
            .addCallback(object : IFrogoViewAdapter<Team> {
                override fun onItemClicked(data: Team) {}

                override fun onItemLongClicked(data: Team) {}

                override fun setupInitComponent(view: View, data: Team) {
                    val tvTitle = view.findViewById<TextView>(R.id.frogo_rv_grid_type_3_tv_title)
                    val tvSubTitle = view.findViewById<TextView>(R.id.frogo_rv_grid_type_3_tv_subtitle)
                    val tvDescription = view.findViewById<TextView>(R.id.frogo_rv_grid_type_3_tv_desc)
                    val ivPoster = view.findViewById<ImageView>(R.id.frogo_rv_grid_type_3_iv_poster)

                    tvTitle.text = data.strTeam
                    tvSubTitle.text = data.strAlternate
                    tvDescription.text = data.strDescriptionEN
                    Glide.with(view.context).load(data.strTeamBadge).into(ivPoster)

                }
            })
            .createLayoutGrid(2)
            .build()

    }


}

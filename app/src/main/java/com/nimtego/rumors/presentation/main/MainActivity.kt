package com.nimtego.rumors.presentation.main

import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.animation.OvershootInterpolator
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.nimtego.rumors.R
import com.robinhood.ticker.TickerUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat


class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var mPresenter: MainPresenter
    var count = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        summ.setOnClickListener {
            mPresenter.summ(first.text.toString().toInt(),
                    second.text.toString().toInt())
        }
        hideLoading()
    }


    override fun showLoading() {
        pb.visibility = VISIBLE
    }

    override fun hideLoading() {
        pb.visibility = GONE
    }

    override fun message(message: Double) {
        tickerView.setCharacterLists(TickerUtils.provideNumberList())
        tickerView.animationDuration = 500
        tickerView.animationInterpolator = OvershootInterpolator()
        tickerView.gravity = Gravity.END
        count = mPresenter.count
        val handler = Handler()
        tickerView.post(object : Runnable {
            override fun run() {
                    count += 0.1
                    mPresenter.countSet(count)
                    val df = DecimalFormat("#.##")
                    tickerView.text = df.format(count)
                    handler.postDelayed(this, 100)
            }
        })
    }
}

package com.nimtego.rumors.presentation.main

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.nimtego.rumors.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        summ.setOnClickListener {
            mPresenter.summ(first.text.toString().toInt(),
                    second.text.toString().toInt())
        }
    }


    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun toast(message: String) {
        this.toast(message)
    }


}

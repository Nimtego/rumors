package com.nimtego.rumors.presentation.base

import android.app.ProgressDialog
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.ProgressBar
import io.reactivex.observers.DefaultObserver

abstract class BaseView : AppCompatActivity(), BaseContract.View {

    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDI()
    }

    private fun initDI() {
        TODO("need di")
    }


    override fun runOnMainThread(runnable: Runnable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toast(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showView(view: Class<in BaseContract.View>, params: Map<String, String>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showView(view: Class<in BaseContract.View>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
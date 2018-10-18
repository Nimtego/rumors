package com.nimtego.rumors

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nimtego.rumors.presentation.contract.AlbumsCollectionContract
import com.nimtego.rumors.presentation.contract.BaseContract

class MainActivity : AppCompatActivity(), AlbumsCollectionContract.View {
    override fun searchText(text: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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

    override fun supplyPresenter(): BaseContract.Presenter<BaseContract.View> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

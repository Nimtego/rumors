package com.nimtego.rumors.presentation.main

import com.nimtego.rumors.presentation.base.BasePresenter

class MainPresenter : BasePresenter<MainViewContract.View, MainViewContract.Interactor>(),
        MainViewContract.Presenter<MainViewContract.View, MainViewContract.Interactor> {
    override fun search() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun pushInRV(position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun longPushInRV(position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun viewIsReady() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
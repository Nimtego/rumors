package com.nimtego.rumors.presentation.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {
    fun summ(first: Int, second: Int) {
        viewState.showLoading()
        viewState.message((first + second).toString())
    }
}
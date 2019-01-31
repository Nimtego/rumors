package com.nimtego.rumors.presentation.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {
    var count = 0.00
    fun summ(first: Int, second: Int) {
        val s = first + second
        viewState.showLoading()
        viewState.message(count)
        println(count)
    }
    fun countSet(count: Double) {
        this.count = count
    }
}
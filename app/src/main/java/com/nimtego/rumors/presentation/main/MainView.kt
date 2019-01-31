package com.nimtego.rumors.presentation.main

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.*


@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView {

    fun showLoading()

    fun hideLoading()

    fun message(message: Double)

}
package com.nimtego.rumors.presentation.main

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType


@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView {

    fun showLoading()

    fun hideLoading()

    fun toast(message: String)

}
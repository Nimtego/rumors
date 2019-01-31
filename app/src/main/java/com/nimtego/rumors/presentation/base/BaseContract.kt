package com.nimtego.rumors.presentation.base

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

interface BaseContract {
    @StateStrategyType(AddToEndSingleStrategy::class)
    interface View : MvpView {

        fun showLoading()

        fun hideLoading()

        fun toast(message: String)

        /*fun supplyPresenter(): Presenter<View, Interactor>*/
    }
    interface Interactor {
        fun stub()
    }
}
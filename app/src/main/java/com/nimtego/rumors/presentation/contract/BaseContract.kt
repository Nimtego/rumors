package com.nimtego.rumors.presentation.contract

interface BaseContract {
    interface Presenter<V : View> {

        val view: V

        fun attach(view: V)

        fun detach()
    }

    interface View {

        fun runOnMainThread(runnable: Runnable)

        fun showLoading()

        fun hideLoading()

        fun toast(message: String)

        fun showView(view: Class<in View>, params: Map<String, String>)

        fun showView(view: Class<in View>)

        fun supplyPresenter(): Presenter<View>
    }
}
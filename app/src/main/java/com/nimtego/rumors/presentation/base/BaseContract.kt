package com.nimtego.rumors.presentation.base

interface BaseContract {
    interface Presenter<V : View, I : Interactor> {

        fun getView(): V?

        fun getInteractor(): I?

        fun attach(view: V?)

        fun detach()
    }

    interface View {

        fun runOnMainThread(runnable: Runnable)

        fun showLoading()

        fun hideLoading()

        fun toast(message: String)

        fun showView(view: Class<in View>, params: Map<String, String>)

        fun showView(view: Class<in View>)

        /*fun supplyPresenter(): Presenter<View, Interactor>*/
    }
    interface Interactor {
        fun stub()
    }
}
package com.nimtego.rumors.presentation.base

abstract class BasePresenter<V : BaseContract.View, I : BaseContract.Interactor> : BaseContract.Presenter<V, I> {

    private var view: V? = null
    private var interactor: I? = null

    override fun getView(): V? {
        return view
    }

    override fun attach(view: V?) {
        this.view = view
    }

    override fun detach() {
        view = null
        interactor = null
    }
}
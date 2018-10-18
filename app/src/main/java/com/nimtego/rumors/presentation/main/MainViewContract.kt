package com.nimtego.rumors.presentation.main

import com.nimtego.rumors.presentation.base.BaseContract

interface MainViewContract {
    interface Presenter<V : View, I : Interactor> : BaseContract.Presenter<V, I> {

        fun search()

        fun pushInRV(position: Int)

        fun longPushInRV(position: Int)

        fun viewIsReady()
    }

    interface View : BaseContract.View {

        fun searchText(): String

        fun clearList()

       // fun setSearchList(list: List<AlbumResult>)
    }

    interface Interactor : BaseContract.Interactor{

      //  fun onFinished(albums: List<Album>)
        fun onFailure(t: Throwable)
    }
}
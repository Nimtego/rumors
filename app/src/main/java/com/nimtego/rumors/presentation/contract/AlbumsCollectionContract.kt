package com.nimtego.rumors.presentation.contract

interface AlbumsCollectionContract {
    interface Presenter<V : View> : BaseContract.Presenter<V> {

        fun search()

        fun pushInRV(position: Int)

        fun longPushInRV(position: Int)

        fun viewIsReady()
    }

    interface View : BaseContract.View {

        fun searchText(text: String)

        fun clearList()

       // fun setSearchList(list: List<AlbumResult>)
    }

    interface OnFinishedListener {

      //  fun onFinished(albums: List<Album>)
        fun onFailure(t: Throwable)
    }
}
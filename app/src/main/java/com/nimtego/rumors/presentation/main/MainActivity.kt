package com.nimtego.rumors.presentation.main

import android.os.Bundle
import com.nimtego.rumors.R
import com.nimtego.rumors.presentation.base.BaseView

class MainActivity : BaseView(), MainViewContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun searchText(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

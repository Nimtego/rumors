package com.nimtego.rumors.presentation.main

import android.content.Context
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import butterknife.BindView
import com.nimtego.rumors.R
import com.nimtego.rumors.presentation.base.BaseView

class MainActivity : BaseView(), MainViewContract.View {

    internal lateinit var presenter: MainViewContract.Presenter<MainViewContract.View,
                                        MainViewContract.Interactor>

    @BindView(R.id.searchText)
    internal lateinit var searchText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        searchText.setOnEditorActionListener(TextView.OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                presenter.search()
                val init = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                init?.hideSoftInputFromWindow(searchText.applicationWindowToken, InputMethodManager.HIDE_NOT_ALWAYS)
                return@OnEditorActionListener true
            }
            false
        })
    }

    override fun searchText() = searchText.text.toString()

    override fun clearList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

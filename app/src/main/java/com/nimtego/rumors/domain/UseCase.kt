package com.nimtego.rumors.domain

import android.annotation.SuppressLint
import io.reactivex.disposables.CompositeDisposable
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.text.PrecomputedText
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.support.v4.util.Preconditions
import io.reactivex.observers.DisposableObserver




abstract class UseCase<T, Param> {
/*    private val threadExecutor: ThreadExecutor? = null
    private val postExecutionThread: PostExecutionThread? = null*/
    private val disposables: CompositeDisposable

    init {
        disposables = CompositeDisposable()
    }
}
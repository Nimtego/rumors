package com.nimtego.rumors.domain

import io.reactivex.disposables.CompositeDisposable


abstract class UseCase<T, Param> {
/*    private val threadExecutor: ThreadExecutor? = null
    private val postExecutionThread: PostExecutionThread? = null*/
    private val disposables: CompositeDisposable

    init {
        disposables = CompositeDisposable()
    }
}
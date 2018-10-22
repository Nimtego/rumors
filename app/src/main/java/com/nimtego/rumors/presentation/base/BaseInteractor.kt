package com.nimtego.rumors.presentation.base

import com.nimtego.rumors.data.MainRepository
import com.nimtego.rumors.domain.Repository

open class BaseInteractor : BaseContract.Interactor{

    private var repository: Repository

    constructor(repository: Repository) {
        this.repository = repository
    }

    constructor() : this(MainRepository())

    override fun stub() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
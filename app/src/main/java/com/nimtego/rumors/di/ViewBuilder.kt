package com.nimtego.rumors.di

import com.nimtego.rumors.presentation.main.MainActivity
import com.nimtego.rumors.presentation.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ViewBuilder {


    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun bindMainActivity(): MainActivity

}
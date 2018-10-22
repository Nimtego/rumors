package com.nimtego.rumors.presentation.main

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

   /* @Provides
    internal fun provideMainInteractor(mainInteractor: MainInteractor): MainViewContract.Interactor = mainInteractor
*/
    @Provides
    internal fun provideMainPresenter(mainPresenter: MainPresenter<MainViewContract.View, MainViewContract.Interactor>)
            : MainViewContract.Presenter<MainViewContract.View, MainViewContract.Interactor> = mainPresenter

}
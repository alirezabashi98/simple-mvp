package com.arb.my.application.ui.mvp.presenter

import com.arb.my.application.ui.mvp.Base
import com.arb.my.application.ui.mvp.model.MainModel
import com.arb.my.application.ui.mvp.view.MainView

class MainPresenter(val view: MainView,val model: MainModel):Base {
    override fun onCreate() {

        setData()

    }

    fun setData(){

        view.onClick(model.getValue())

    }

    override fun onDestroy() {

    }


}
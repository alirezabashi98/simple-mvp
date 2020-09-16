package com.arb.my.application.ui.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arb.my.application.ui.mvp.model.MainModel
import com.arb.my.application.ui.mvp.presenter.MainPresenter
import com.arb.my.application.ui.mvp.view.MainView

class MainActivity : AppCompatActivity() {

    lateinit var presenter : MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = MainView(this)
        val model = MainModel(this)

        setContentView(view)

        presenter = MainPresenter(view,model)
        presenter.onCreate()

    }

    override fun onDestroy() {
        super.onDestroy()

        presenter.onDestroy()
    }
}
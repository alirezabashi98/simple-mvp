package com.arb.my.application.ui.mvp.model

import androidx.appcompat.app.AppCompatActivity

class MainModel(private val activity: AppCompatActivity) {

    fun getValue(): String = "AlirezaBashi98"

    fun getExtra(): String = activity.intent.getStringExtra("key").toString()

}
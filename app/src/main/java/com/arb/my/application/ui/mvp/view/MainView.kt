package com.arb.my.application.ui.mvp.view

import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.arb.my.application.ui.mvp.R
import kotlinx.android.synthetic.*

class MainView(private val activity: AppCompatActivity) : FrameLayout(activity) {

    private val view = inflate(activity, R.layout.activity_main,this)
    private val tv = view.findViewById<TextView>(R.id.tv_main)
    private val btn = view.findViewById<Button>(R.id.btn_main)
    private val btn2 = view.findViewById<Button>(R.id.btn2_main)

    fun onClick(value:String){

        btn.setOnClickListener {
            setText(value)
        }

    }

    fun onClick2(value: String){

        btn2.setOnClickListener {
            setText(value)
        }

    }

    fun setText(value:String){

        tv.text = value

    }

}
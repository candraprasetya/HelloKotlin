package com.kardusinfo.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val hallo = findViewById<TextView>(R.id.Hello)
        val sapa = "HelloKotlin!"

        hallo.setText(sapa)
    }
}

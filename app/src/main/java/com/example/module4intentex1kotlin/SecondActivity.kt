package com.example.module4intentex1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    var TAG = SecondActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }
    fun initView() {
        var tv_second = findViewById<TextView>(R.id.tv_second)

        var name = intent.getStringExtra("name")
        var surname = intent.getStringExtra("surname")

        Log.d(TAG, name!!)
        Log.d(TAG, surname!!)

        tv_second.text = "$name $surname"
    }
}
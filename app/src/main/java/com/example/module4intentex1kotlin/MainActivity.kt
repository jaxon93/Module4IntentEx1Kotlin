package com.example.module4intentex1kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        var name = "Jakhongir"
        var surname = "Gaffarov"
        var b_openSecond = findViewById<Button>(R.id.b_openSecond)

        b_openSecond.setOnClickListener{

            openSecondActivity(name, surname)
        }
    }
    fun openSecondActivity(name: String, surname: String) {
        var intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("surname", surname)
        startActivity(intent)
    }
}
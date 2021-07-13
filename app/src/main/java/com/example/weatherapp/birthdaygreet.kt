package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthdaygreet.*

class birthdaygreet : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name-extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreet)
        val name =  intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text="Happy Birthday\n$name..!"

    }
}
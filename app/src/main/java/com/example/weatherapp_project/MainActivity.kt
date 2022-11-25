package com.example.weatherapp_project

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapp.WeatherAppLauncherActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val search_btn = findViewById<TextView>(R.id.search_btn_other)
        search_btn.setOnClickListener() {
            val userInput = findViewById<TextView>(R.id.search2).text.toString()
            val sender = Intent(this@MainActivity, WeatherAppLauncherActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
            sender.putExtra("keyString", userInput)
            startActivity(sender)
        }
    }
}

package com.example.lab04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.ButtonStart)
        val intent = Intent(this, StudentsListActivity::class.java)

        startButton.setOnClickListener {
            startActivity(intent)
        }
    }
}
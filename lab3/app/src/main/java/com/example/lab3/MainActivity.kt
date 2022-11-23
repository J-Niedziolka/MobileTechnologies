package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lab3.model.CodeManager

class MainActivity : AppCompatActivity() {
    var cm = CodeManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super.onStart()
        Log.d("TagName", "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d("TagName", "onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d("TagName", "onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("TagName", "onStop")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d("TagName", "onRestart")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d("TagName", "onDestroy")
    }
}
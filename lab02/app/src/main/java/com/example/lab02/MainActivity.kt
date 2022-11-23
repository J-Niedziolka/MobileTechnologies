package com.example.lab02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.lab02.models.CodeManager

class MainActivity : AppCompatActivity() {
    var cm = CodeManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextName = findViewById<EditText>(R.id.EditTextName)
        editTextName.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?){

            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int){

            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int){
                cm.name = p0.toString()
            }
        })

        var buttonAddOne = findViewById<Button>(R.id.ButtonAddOne)
        buttonAddOne.setOnClickListener{
            cm.increaseCounter()
        }

        var buttonCleanCounter = findViewById<Button>(R.id.ButtonCleanCounter)
        buttonCleanCounter.setOnClickListener{
            cm.counter = 0
        }

        var displayText = findViewById<TextView>(R.id.TextViewDisplay)
        displayText.text = "Gratuluje ${cm.name} napisales juz ${cm.counter} linii kodu!"
    }
}
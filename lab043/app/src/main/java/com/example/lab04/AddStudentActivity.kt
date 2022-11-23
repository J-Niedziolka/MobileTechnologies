package com.example.lab04

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class AddStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        var nameField = findViewById<EditText>(R.id.StudentName)
        var buttonAddActivity = findViewById<Button>(R.id.ButtonAddActivity)

        buttonAddActivity.setOnClickListener{
            intent.putExtra("results", nameField.text)
            setResult(Activity.RESULT_OK, intent)
            finish()

            var poleTekstowe = findViewById<TextView>(R.id.StudentName)
        }
    }
}
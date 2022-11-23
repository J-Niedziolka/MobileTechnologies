package com.example.lab04

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class StudentsListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students_list)

        val addButton = findViewById<Button>(R.id.ButtonAdd)
        val addStudentIntent = Intent(this, AddStudentActivity::class.java)

        addButton.setOnClickListener {
            startActivityForResult(addStudentIntent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 1){
            if(resultCode == Activity.RESULT_OK){
                var result = data!!.getCharSequenceExtra("results")
                val toast = Toast.makeText(
                    applicationContext,
                    result.toString(),
                    Toast.LENGTH_SHORT
                )
                toast.show()
            }else {
                //obsługa błędnych rezultatów
            }
        }
    }
}
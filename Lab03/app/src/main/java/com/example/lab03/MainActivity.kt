package com.example.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.example.lab03.models.CodeManager


/*var listView = findViewById<ListView>(R.id.listView)
        var editTextName = findViewById<ListView>(R.id.listView)
*/

class MainActivity : AppCompatActivity() {
    private var cm = CodeManager()

    var myStrings: MutableList<String> = mutableListOf()
    var index = 0
    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,
        myStrings)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter


        var buttonAdd = findViewById<Button>(R.id.buttonAdd)
        buttonAdd.setOnClickListener{
            //cm.increaseCounter()
            myStrings.add("item" + index)
            index++
            adapter.notifyDataSetChanged()
        }
        var buttonRemove = findViewById<Button>(R.id.buttonRemove)
        buttonRemove.setOnClickListener{
            myStrings.clear()
            index = 0
            adapter.notifyDataSetChanged()
        }

        listView.setOnItemClickListener {
            parent, view, position, id -> Log.d("TagName", "position:$position id:$id")
            var element = adapter.getItem(position)
            adapter.remove(element)
            adapter.notifyDataSetChanged() }
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
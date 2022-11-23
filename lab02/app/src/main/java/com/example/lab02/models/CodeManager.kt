package com.example.lab02.models

class CodeManager {
    var name: String = ""
        get() = field
        set(value){
            field = value
        }
    var counter: Int = 0
        get() = field
        set(value){
            field = value
        }

    init{
        println("Konstruktor wywołany")
    }

    fun increaseCounter(){
        this.counter += 1
    }

}


package com.example.kotlinbasics

class Dog(var name: String,val breed:String,var age:Int) {
    init {
        bark(name)
    }
    fun bark(name:String)
    {
        println("$name says woof woof")
    }
}
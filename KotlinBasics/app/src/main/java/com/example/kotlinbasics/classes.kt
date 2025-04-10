package com.example.kotlinbasics

fun main()
{
    var Daisy = Dog("Daisy","rodveiler",10)
    println("${Daisy.name} is ${Daisy.breed} and is of ${Daisy.age} years")
    Daisy.name = "Sussy"
    println("${Daisy.name} is ${Daisy.breed} and is of ${Daisy.age} years")

}
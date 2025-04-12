package com.example.kotlinbasics

fun main()
{
    val shoppinglist = mutableListOf("Pen","Pencil","book")
    shoppinglist.add("chair")
    println(shoppinglist)


    for(item in 0 until shoppinglist.size)
    {
        println("${shoppinglist[item]} and its index${item+1}")
    }
}

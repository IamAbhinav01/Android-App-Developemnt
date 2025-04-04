package com.example.rockpaperscissors

fun main()
{
    var cchoice = ""
    var pchoice =""
    print("Enter your choice : (Rock,Paper Or Scissors): ")
    pchoice = readln()
    var cnum = (1..3).random()
    when (cnum) {
        1 -> {
            cchoice = "Rock"
        }
        2 -> {
            cchoice = "Paper"
        }
        3 -> {
            cchoice = "Scissors"
        }
    }
    println("The computers choice is : "+cchoice)
    val winner = when
    {
        pchoice == cchoice ->"Tie"
        cchoice == "Scissors" && pchoice == "Paper" ->"Computer"
        cchoice == "Paper" && pchoice == "Rock" ->"Computer"
        cchoice == "Rock" && pchoice == "Scissors" ->"Computer"
        else -> "Player"
    }
    if(winner == "Tie")
    {
        println("Its a Tie")
    }
    else{
        println("$winner" + " won!")
    }
}

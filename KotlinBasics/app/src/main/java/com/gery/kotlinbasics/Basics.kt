package com.gery.kotlinbasics

fun main() {

    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper, or Scissor? PICK!!")
    playerChoice = readln()

    val randomNumber = (1..3).random()

    if (randomNumber == 1) {
        computerChoice = "Rock"
    } else if (randomNumber == 2) {
        computerChoice = "Paper"
    } else if (randomNumber == 3) {
        computerChoice = "Scissor"
    }
    println(computerChoice)
}
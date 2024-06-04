package com.gery.kotlinbasics

fun main() {

    var userInput = readln()
    while (userInput == "1") {
        println("While loop executed")
        userInput = readln()
    }

    print("Loop finished!")

}
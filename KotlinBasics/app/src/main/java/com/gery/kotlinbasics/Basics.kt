package com.gery.kotlinbasics

fun main() {

    var age = 35

    // greater than >
    // lower than <
    // greater equal >=
    // lower equal <=
    // equal ==
    // not equal !=

    println("Enter your age")

    val enteredValue = readln()
    age = enteredValue.toInt()

    if (age >= 18) {
        println("You can come in")
    } else {
        println("You are not allowed")
    }
}
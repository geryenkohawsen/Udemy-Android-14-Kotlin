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

    if (age in 18..39) {
        println("You can come in")
    } else if (age >= 40) {
        println("Too old")
    } else {
        println("You are not allowed")
    }
}
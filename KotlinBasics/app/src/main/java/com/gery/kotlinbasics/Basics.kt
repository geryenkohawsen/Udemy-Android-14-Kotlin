package com.gery.kotlinbasics

fun main() {
    val myResult = add(5, 10)
    println(myResult)
}

fun add(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}

fun askCoffeeDetails() {
    println("Who is the coffee for?")
    val name = readln()

    println("How much sugar?")
    val sugarCountInput = readln()
    val sugarCountInt = sugarCountInput.toInt()

    makeCoffee(sugarCountInt, name)
}

fun makeCoffee(sugarCount: Int, name: String) {
    when (sugarCount) {
        1 -> {
            println(message = "Make coffee with $sugarCount spoon of sugar for $name")
        }

        0 -> {
            println("Make black coffee for $name")
        }

        else -> {
            println("Make coffee with $sugarCount spoons of sugar for $name")
        }
    }
}
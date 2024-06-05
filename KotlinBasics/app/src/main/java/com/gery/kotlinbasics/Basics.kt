package com.gery.kotlinbasics

fun main() {

    println("Enter number 1")
    val num1Str = readln()
    val num1Int = num1Str.toInt()
    println("Enter number 2")
    val num2Str = readln()
    val num2Int = num2Str.toInt()


    val myResult = add(num1Int, num2Int)
    println("The result is $myResult")
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
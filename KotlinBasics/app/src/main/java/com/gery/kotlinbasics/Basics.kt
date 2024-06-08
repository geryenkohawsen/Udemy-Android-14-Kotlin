package com.gery.kotlinbasics

import androidx.annotation.Size

data class CoffeeDetails(
    val sugarCount: Int, val name: String, val size: String, val creamAmount: Int
)

fun main() {

    val coffeeForDenis =
        CoffeeDetails(name = "Denis", size = "Large", sugarCount = 2, creamAmount = 1)

    makeCoffee(coffeeForDenis)/*
    // Creating an object (instance) of the class dog
    val anjing = Dog("Sani", "Tai")

    println("${anjing.name} is a ${anjing.age} years old ${anjing.breed}")
    println("A year has passed!")
    anjing.age = 21

    println("${anjing.name} is a ${anjing.age} years old ${anjing.breed}")
    */
}

fun askCoffeeDetails() {
    println("Who is the coffee for?")
    val name = readln()

    println("How much sugar?")
    val sugarCountInput = readln()
    val sugarCountInt = sugarCountInput.toInt()
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    when (coffeeDetails.sugarCount) {
        1 -> {
            println(message = "Make coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} with ${coffeeDetails.creamAmount} cream")
        }

        0 -> {
            println("Make black coffee for ${coffeeDetails.name}")
        }

        else -> {
            println("Make coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")
        }
    }
}
package com.gery.kotlinbasics

fun main() {
    makeCoffee(1, "test1")
    makeCoffee(0, "test2")
    makeCoffee(25, "test3")
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
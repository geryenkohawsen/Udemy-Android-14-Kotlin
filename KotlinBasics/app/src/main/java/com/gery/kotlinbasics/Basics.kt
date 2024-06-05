package com.gery.kotlinbasics

fun main() {
    makeCoffee(1)
    makeCoffee(25)
}

fun makeCoffee(sugarCount: Int) {
    if (sugarCount == 1) {
        println("Make coffee with $sugarCount spoon of sugar")
    } else {
        println("Make coffee with $sugarCount spoons of sugar")
    }
}
package com.example.geryshoppinglistapp

fun main() {
    val numbers = listOf(1,2,3)
    val doubled = numbers.map{it * 2}
    println(doubled)

    val blueRoseVase = Vase(color = "Blue", design = "Rose")
    val redRoseVase = blueRoseVase.copy(color = "Red")

    println(blueRoseVase)
    println(redRoseVase)
}

data class Vase(val color: String, val design: String)
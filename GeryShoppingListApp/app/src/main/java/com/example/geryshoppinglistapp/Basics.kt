package com.example.geryshoppinglistapp

import androidx.compose.ui.text.toUpperCase
import java.util.Locale

fun main() {
    val numbers = listOf(1,2,3)
    val doubled = numbers.map{it * 2}
    println(doubled)

    val blueRoseVase = Vase(color = "Blue", design = "Rose")
    val redRoseVase = blueRoseVase.copy(color = "Red")

    println(blueRoseVase)
    println(redRoseVase)

    // nullable string
    // let keyword allows you to safely work with a nullable value
    val name: String? = "Ella"
    name?.let{
        println(it.uppercase())
    }
}

data class Vase(val color: String, val design: String)
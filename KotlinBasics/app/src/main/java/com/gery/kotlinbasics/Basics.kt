package com.gery.kotlinbasics

fun main() {

    // Creating an object (instance) of the class dog
    val anjing = Dog("Sani", "Tai")

    println("${anjing.name} is a ${anjing.age} years old ${anjing.breed}")
    println("A year has passed!")
    anjing.age = 21

    println("${anjing.name} is a ${anjing.age} years old ${anjing.breed}")
}
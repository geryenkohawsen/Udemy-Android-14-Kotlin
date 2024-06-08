package com.gery.kotlinbasics

class Dog constructor(val name: String, val breed: String, var age: Int = 0) {

    // A code that will execute when an instance of a class is created
    init {
        bark()
    }

    fun bark() {
        println("$name Woof woof")
    }
}
package com.gery.kotlinbasics

// var if you want to allow the property value to be change after an instance is created
class Dog constructor(val name: String, val breed: String, var age: Int = 0) {

    // A code that will execute when an instance of a class is created
    init {
        bark()
    }

    fun bark() {
        println("$name Woof woof")
    }
}
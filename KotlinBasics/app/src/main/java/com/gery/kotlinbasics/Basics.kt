package com.gery.kotlinbasics

fun main() {

    // Immutable list
    val immutShoppingList = listOf("Processor", "RAM", "CPU")
    // Mutable List
    val shoppingList = mutableListOf("Processor", "RAM", "CPU", "RTX 3060")
    println(shoppingList)

//    // adding items to list
//    shoppingList.add("Fan")
//    println(shoppingList)
//
//    // removing items
//    shoppingList.remove("RTX 3060")
//    println(shoppingList)
//    shoppingList.add("RTX 4090")
//    println(shoppingList)
//
//    // removing by index
//    shoppingList.removeAt(2)
//    println(shoppingList)
//
//    // adding by index
//    shoppingList.add(0, "i9 CPU")
//    println(shoppingList)
//    println("Index 2 " + shoppingList[2])
//    shoppingList[3] = "NEW Fan"
//    println(shoppingList[3])
//
//    // Same way as shoppingList[1]
//    shoppingList.set(1, "Water Cooling")
//    println(shoppingList)

    // Check if a list contains
    val hasRam = shoppingList.contains("RAM")
    if (hasRam) {
        println("There is a RAM in the list")
    } else {
        println("No RAM in the list")
    }

    for (item in shoppingList) {
        println(item)
        if (item == "RAM") {
            shoppingList.removeLast()
            break
        }
    }

    println(shoppingList)
}


/*
data class CoffeeDetails(
    val sugarCount: Int, val name: String, val size: String, val creamAmount: Int
)

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
*/
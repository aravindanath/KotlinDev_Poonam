package org.example.day5

fun main(){

    var fruits = listOf("Apple","Banana","Mango","Orange","Apple","Watermelon")

//    println(fruits[0])
//
//    println("First Fruit: ${fruits.first()}")
//    println("Last Fruit: ${fruits.last()}")
//
//
//    for(fruit in fruits){
//        println(fruit)
//    }

    val filterValue = fruits.filter { it.startsWith("A") }
    println("Filter Value: $filterValue")

    println(fruits.size)

    println(fruits.indexOf("Mango"))

}
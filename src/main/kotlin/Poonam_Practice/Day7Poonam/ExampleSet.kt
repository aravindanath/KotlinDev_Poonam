package org.example.Poonam_Practice.Day7Poonam


fun main() {

    var setAnimal1 = setOf("Dog", "Cat", "Elephant", "cow",null)
    for (s in setAnimal1){

        println(s)}
        println(setAnimal1.size)
        println(setAnimal1.indexOf("Dog"))
        println(setAnimal1.indices)
    println(setAnimal1.elementAt(2))
    println(setAnimal1.first())
    println(setAnimal1.last())
    println(setAnimal1.reversed())
    println(setAnimal1.contains("Dog"))
    println(setAnimal1.isEmpty())
    println(setAnimal1.filterNotNull())







}


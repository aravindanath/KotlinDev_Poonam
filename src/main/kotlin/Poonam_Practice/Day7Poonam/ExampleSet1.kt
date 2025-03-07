package org.example.Poonam_Practice.Day7Poonam

fun main(){


var flower = mutableSetOf("Rose","Lilly","Hibiscus")
    flower.add("periwinkle")
    flower.remove("Rose")
    for(i in flower){
        println(i)
    }

    println("--------")
    println(flower.isEmpty())



}
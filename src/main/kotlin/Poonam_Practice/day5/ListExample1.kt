package org.example.Poonam_Practice.day5

fun main(){
     var city= listOf("Mumbai","Pune","Bangalore","Delhi")// listof is read only or immutable list
    var city1= mutableListOf("Chicago","Newyork","california")//mutableListof is mutable list means we can add or remove items from list

    city1.add("Miami")
    for(y in city1){
        println(y)
    }

    for(i in city){
        println(i)

    }

}
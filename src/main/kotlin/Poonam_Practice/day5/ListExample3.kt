package org.example.Poonam_Practice.day5

fun main(){
     var days= mutableListOf("Monday","Tuesday","Wednesday","Thursday1")
    days.add("Friday")
    days.removeFirst()
    days.removeLast()
    println(days)

    var newdays = days.filter { it.endsWith("1") }
    println(newdays)


   days.set(2,"Thursday")
    println(days)


}
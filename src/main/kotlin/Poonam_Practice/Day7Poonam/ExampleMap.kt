package org.example.Poonam_Practice.Day7Poonam


fun main(){
var months = mapOf(1 to "Jan", 2 to "Feb",3 to "Mar",4 to "april")

    for(i in months){
        println(i.key)
        println(i.value)


    }

    println("--------")
    println(months.size)
    println(months.get(1))
    println(months.containsKey(2))
    println(months.containsValue("Jan"))


    var num = mutableMapOf(1 to "One",2 to "two", 3 to "three")
    num.remove(1)
    println(num)
}
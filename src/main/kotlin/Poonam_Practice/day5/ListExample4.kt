package org.example.Poonam_Practice.day5

fun main(){
    var country = mutableListOf("India","USA","UK",null)
    country.add("Mexico")

    //println(country.sorted().sortedDescending())

    if("India" in country)
    {
        println("Asia")
    }

    else{
        println("other country")
    }


println(country.indexOf("India"))
    println("Element at 2nd position is :"+country.get(1))

    println("remove null from list"+ country.filterNotNull())
    println(country)

    var elements = country.drop(2)
    println(elements)
}
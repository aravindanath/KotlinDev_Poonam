package org.example.day7

fun main(){

    val seta = setOf("Green", "Blue", "Red","Red","Green","Yellow",2,3,4,5,6,7,8,9,10)


    for(i in seta){
        println(i)
    }

    println(seta.elementAt(3))
    println(seta.indexOf("Blue"))
    println(seta.first())
    println(seta.last())
}
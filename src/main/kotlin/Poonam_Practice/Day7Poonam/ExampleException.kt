package org.example.Poonam_Practice.Day7Poonam

fun main(){

    try{
        var a =10/0
        println(a)

    }
    catch (e: Exception) {
        println("exception")

    }
    finally {
        println("this is finally block and it will be always executed weather exception is handled or not")
    }


}
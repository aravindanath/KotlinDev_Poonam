package org.example.day7

fun main(){

    try {
        var num = 10 /0
        println(num)
    } catch (e: Exception){
//        TODO("Not yet implemented")
        println("Div by zero is not allowed")
    }catch (e: NullPointerException){
        println("Null value is not allowed")
    }finally {
        println("Kill the session")
    }

    println("Ending of the program")
}
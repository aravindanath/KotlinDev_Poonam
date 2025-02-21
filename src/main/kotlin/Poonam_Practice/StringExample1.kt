package org.example.Poonam_Practice

fun main(){
    var str = "My name is Poonam" // string is immutable means can not be changed and starts with index 0
    println(str.length)
    println(str[3])
   println(str.reversed())
    println(str.subSequence(0,4))// prints string from index 0 to index 3.it excludes 4th index
    for(i in str.reversed())
        println(i)

    for(i in str){
        println(i)
    }


}
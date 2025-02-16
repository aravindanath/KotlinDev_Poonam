package org.example.day4

fun main(){


    /**
     *  Structural Equality ==  -> Compares the content of the string
     *  Referential Equality === -> Compares the reference of the string
     *
     */
    var x = "Arvind is a software developer"
    var y = "Arvind is a software developer"
    var z = "Arvind"


    println(x===y)
    println(y==z)

}
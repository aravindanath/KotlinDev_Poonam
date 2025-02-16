package org.example.day4

class ExampleArray1 {


}


fun main(){

    val arrayValue = arrayOf(1,2,3,4,5,6,7,8,9,10,"Arvind") // Implicit type
    val arrayValue1 = arrayOf<Int>(1,2,3,4,5,6,7,8,9,10) // Explicit type
//
//    println(arrayValue[0]) // 1
//
//    for (i in arrayValue){
//        println(i)
//    }
//
//    println(arrayValue.size)

    for(i in arrayValue1.size-5 downTo 3){
        println(i)
    }

}
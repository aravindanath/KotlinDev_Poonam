package org.example.Poonam_Practice.Day4Poonam
fun main() {

    var numbers = arrayOf(1, 2, 3, 4, 5, 6, "one", "Two")
    var num = arrayOf<Int>(5, 2, 8, 9, 45)
    println(num[3])


    for(i in numbers){
        println(i)
    println(numbers.size)}


    for(x in num.indices)// print the index of arrays
    {
        println(x)
        println("index of array at ${num.indices} ")
    }
    for(y in num.size-2 downTo 1){//print index from array size-2 to index 1
        println(y)
    }
}


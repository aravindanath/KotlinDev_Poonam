package org.example.Poonam_Practice

fun main(){
    var ch = charArrayOf('A','B','C','D','E')

    for(i in ch){
        println(i)// print values in array

    }

    ch.set(1,'F')// updating or changing value at 1st index
    println(ch.get(1))//print value at 1st index
    println(ch[1])//print value at 1st index


    var ln = longArrayOf(1,2,3,4,5)//creating arry of type long
    var x= intArrayOf(2,5,8,9)



}
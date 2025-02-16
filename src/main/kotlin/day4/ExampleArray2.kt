


fun main(){


    var char = charArrayOf('A','B','C','D','E','F','G','H','I','J')
    var char2 = arrayOf<Char>('A','B','C','D','E','F','G','H','I','J')
    var longArray = longArrayOf(1,2,3,4,5,6,7,8,9,10)
    var intArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)

//    println(char[0]) // A
//    println(char.get(4))
    char.set(4,'Z')
//    println(char.get(4))

    for (x in char){
        println(x)
    }

}
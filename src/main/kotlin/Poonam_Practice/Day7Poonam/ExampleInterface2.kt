package org.example.Poonam_Practice.Day7Poonam

interface city{
    fun mall()
    fun park()
    fun market()
}

interface country: city{
    fun stadium()
    fun touristplace()
    var state :Int


}
class US: country{
    override var state: Int
        get() = 12
        set(value) {}
    override fun stadium() {
        println("US has multiple stadiums")
    }

    override fun touristplace() {
        println("beaches,mountains")
    }

    override fun mall() {
        println("mall of america")

    }

    override fun park() {
        println("starved rock park")
    }

    override fun market() {
        println("farmers markets")
    }

}

fun main(){

    val u = US()
    u.market()
    u.mall()
    println(u.state)
}

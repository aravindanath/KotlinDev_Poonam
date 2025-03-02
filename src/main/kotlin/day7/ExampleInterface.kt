package org.example.day7


interface  vehical{
    fun start()
    fun stop()
    fun move()
}

class KIA : vehical{
    override fun start() {
        println("KIA started")
    }

    override fun stop() {
        println("KIA stopped")
    }

    override fun move() {
        println("KIA moving")
    }

}

class AUDI : vehical{
    override fun start() {
        println("AUDI started")
    }

    override fun stop() {
        println("AUDI stopped")
    }

    override fun move() {
        println("AUDI moving")
    }

}

fun main(){
    val kia = KIA()
    kia.start()
    kia.move()
    kia.stop()

    val audi = AUDI()
    audi.start()
    audi.move()
    audi.stop()
}
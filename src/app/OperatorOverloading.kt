package app

import data.Fruit

fun main() {
    val fruit1 = Fruit(16) + Fruit(55)
    println(fruit1.quantity)

    val fruit2 = Fruit(20) - Fruit(10)
    println(fruit2.quantity)

    val fruit3 = Fruit(3) < Fruit(20)
    println(fruit3.compareTo(fruit2.quantity < 0))
    println(fruit3)
}
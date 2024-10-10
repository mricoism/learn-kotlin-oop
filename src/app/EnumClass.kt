package app

import data.Tire

fun main() {
    val soft = Tire.Soft
    val hard = Tire.Hard
    val allTires: Array<Tire> = Tire.values()
    println(allTires.toList())

    val softFromString = Tire.valueOf("Soft")
    val mediumFromString = Tire.valueOf("Medium")
    val hardFromString = Tire.valueOf("Hard")
}
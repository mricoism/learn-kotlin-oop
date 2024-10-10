package app

import data.Cat
import data.Lion

fun main() {
    val snoA = Cat()
    snoA.run()
    println(snoA.name)

    val simba = Lion("Simba")
    simba.run()
    println(simba.name)
}
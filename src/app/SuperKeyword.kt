package app

import data.Rectangle

fun main() {
    val shape2 = Rectangle()
    println("Corner: ${shape2.corner}")
    println("Parent Corner: ${shape2.parentCorner}")
    shape2.printName()
}
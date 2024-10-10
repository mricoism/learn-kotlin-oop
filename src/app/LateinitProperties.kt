package app

import data.Television

fun main() {
    val tv1 = Television()
    println(tv1.brand)

    tv1.setName("APPLE")
    println(tv1.brand)
}
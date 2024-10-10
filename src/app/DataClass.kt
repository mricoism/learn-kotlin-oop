package app

import data.Product

fun main() {
    val product1 = Product("Indomie", 1_500, "Food")
    println(product1)
    println(product1.name)
    println()

    /*
    KT.30.b - COPY DATA CLASS
    - Data class memiliki function copy yang bisa digunakan untuk menduplikasi object.
    - Bahkan metode copy yang terdapat di data class bisa digunakan untuk menduplikasi sekaligus mengubah properties nya
     */
    val product2 = product1.copy(name = "Supermie")
    println(product2)
    println(product2.name)
}
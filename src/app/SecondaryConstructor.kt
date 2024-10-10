package app

import data.Address

fun main() {
    val rumah = Address("Gang VIII", "Jakarta Timur")
    val kantor = Address("Jalan A", "Shinjuku", "Japan")

    println(rumah.street)
    println(kantor.street)
}
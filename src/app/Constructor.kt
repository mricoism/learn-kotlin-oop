package app

import data.Car

fun main() {
    val supra = Car("Toyota", "Supra",2000)
    supra.year = 2021
    println("We selling a ${supra.type} it's${supra.brand} ${supra.name} production at ${supra.year}")
    println("is ${supra.name} is old car ? ${supra.oldCar}")
}
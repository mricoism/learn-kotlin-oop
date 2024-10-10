package app

import data.ManagerV1
import data.ManagerV2

fun main() {
    var neymar = ManagerV1.Player("Neymar")
    println(neymar.name)
    neymar.sayHalo()
    println()

    var manager =  ManagerV2("Guardiola")
    println(manager.name)
    val kdb =  manager.Player("KDB")
    println(kdb.name)
    kdb.sayHalo()
    println()

    val mahrez = manager.Player("Mahrez")
    println(mahrez.name)
    mahrez.sayHalo()
}
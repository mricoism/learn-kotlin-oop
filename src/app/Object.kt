package app

import data.Person
fun main() {
    var riko = Person("Muhammad", "Riko", "Ismail")
    val lewis = Person("Lewis",null, "Hammilton")
    var leclerc = Person("Charles", "Leclerc") // Using Secondary Constructor
    var suyadi = Person("Suyadi") // Using Third Constructor

    println(riko.midName)
    println(lewis.midName)
    println(leclerc.lastName)
    println(suyadi.firstName)
    println()

    riko.sayHallo(suyadi.firstName)
    riko.run()
    val rikoFullName: String = riko.getFullName()
    println(rikoFullName)

    val rikoBachelor: String = riko.title("S.T")
    val rikoMaster: String = riko.title("S.T", "M.T")
    println(rikoBachelor)
    println(rikoMaster)

}
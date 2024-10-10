package app

import data.Goverment
import data.Human

fun main() {
    val riko = Human("Riko")
    riko.sayHello("ismail")
    riko.askPlace("Kudus")
    riko.to("Kudus")
    riko.go()
    println()

    val person = Goverment("msiocirm")
    person.sayHello(riko.name)
    person.go()
    person.goToOffice()
    person.move()
}
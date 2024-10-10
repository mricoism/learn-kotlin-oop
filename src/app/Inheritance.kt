package app

import data.CiefTechnicalOperation
import data.Manager

fun main() {
    var manager = Manager("Riko")
    var cto = CiefTechnicalOperation("Kimmi")
    manager.sayHallo("Oscar")
    cto.sayHallo("Russel")

}
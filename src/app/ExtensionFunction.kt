package app

import data.Student
import data.introduceSelf
import data.sayHalo
import data.upperName

fun main() {
    val riko = Student("Riko", 16)
    riko.introduceSelf("Cycling")
    println()

    val hendri: Student? = Student("Hendri", 15)
    hendri?.sayHalo(riko.name)
    println(hendri?.upperName)

}
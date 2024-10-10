package app

import data.HomeroomTeacher
import data.Teacher

fun main() {
    val pakToto = Teacher("Toto", 6_000_000)
    pakToto.name
    pakToto.teach()
    // pakToto.doPresent() // Error Bcs private
    println()

    val pakSiswanto = HomeroomTeacher("Siswanto", 8_000_000)
    pakSiswanto.teach()

}
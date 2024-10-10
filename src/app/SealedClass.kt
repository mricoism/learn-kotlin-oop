package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun main() {
    val result1 = operation(44, 55, Plus())
    println(result1)

    val result2 = operation(20, 28, Modulo())
    println(result2)
}

/*
KT.32.b - SEALED CLASS ON WHEN EXPRESSION
- Sealed class sangat berguna saat kita menggunakan when expression
- Dengan menggunakan sealed class, kita bisa membatasi hanya class turunannya yang perlu di check
 */
fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when(operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
        else -> 0
    }
}
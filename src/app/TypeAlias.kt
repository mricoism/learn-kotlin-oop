package app

import data.Application
// import data2.Application // ERROR
import data.Student

/*
KT.37.a - TYPEALIAS
- Kotlin mendukung Type Alias
- Type Alias adalah membuat nama berbeda dari tipe data yang telah ada
- Biasanya ini digunakan ketika ada tipe data dengan nama yang sama, atau untuk mempersingkat tipe data sehingga kita tidak perlu menulisnya terlalu panjang
 */
typealias App = Application
typealias Pelajar = Student
typealias Murid = Pelajar
typealias App2 = data2.Application

/*
KT.37.b - TYPEALIAS FOR FUNCTION
- Type Alias tidak hanya bisa digunakan untuk class saja, namun bisa untuk function
- Dengan menggunakan Type Alias untuk function, kita akan lebih mudah saat menggunakan function sebagai parameter, karena lebih sederhana
 */
typealias StringSuplier = () -> String

fun sayHallo1(supplier: ()->String) {
    println("Hallo.. ${supplier()}")
}

fun sayHallo2(supplier: StringSuplier) {
    println("Hallo.. ${supplier()}")
}

fun main() {
    val baf = App("Asset Management")
    println(baf.name)
    println()

    val baf2 = App2("QR CODE")
    println(baf2.name)
    println()

    sayHallo1 { "Riko" }
    sayHallo2 { "Mail" }
}
package app

import data.Handphone
import data.Laptop

/*
KT.18 - TYPE CHECK / CAST
- Dalam Object Oriented Programming, kita akan bertemu dengan banyak sekali tipe data (class) dan pewarisan (inheritance)
- Kadang kita butuh melakukan pengecekan tipe data, atau bahkan melakukan konversi data

IS & !IS OPERATOR
- is digunakan untuk melakukan pengecekan apakah sebuah data merupakan tipe data tertentu
- !is digunakan untuk melakukan pengecekan apakah sebuah data bukan merupakan tipe data tertentu

SMART CAST
- Kotlin memiliki mekanisme konversi data secara otomatis setelah kita melakukan pengecekan menggunakan is
- Setelah kita melakukan pengecekan menggunakan is, maka secara otomatis tipe data yang kita cek akan berubah menjadi tipe data yang kita check

CAST ON WHEN EXPRESSION
- Selain menggunakan If untuk melakukan pengecekan tipe data dan konversi tipe data
- Kita juga bisa menggunakan when expression
- Penggunaan when expression akan lebih sederhana dibanding if expression dalam melakukan pengecekan dan konversi tipe data

UNSAFE CAST
- Kotlin juga mendukung konversi tipe data secara paksa menggunakan kata kunci as
- Namun konversi menggunakan as sangat tidak aman jika ternyata tipe datanya tidak sesuai

SAFE NULLABLE CAST
- Penggunaan as sangat tidak aman, namun kadang bisa menjadikannya aman, dengan menggunakan kata kunci as?
- Dengan menggunakan kata kunci as? secara otomatis jika gagal melakukan konversi, akan diubah menjadi null
 */

fun printObject(any: Any) {
    println(any)
}

fun printObjectIf(any: Any) {
    if (any is Laptop) {
        println("Laptop: ${any.name}")
    } else if (any is Handphone) {
        println("Handphone: ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop: ${any.name}")
        is Handphone -> println("Handphone: ${any.name}")
        else -> println(any)
    }
}

fun printUnsafeString(any: Any) {
    val value: String = any as String
    println(value)
}

fun printSafeString(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("Riko")
    printObject(67)
    printObject(Handphone("Nokia"))
    printObject(Laptop("Legion"))
    println()

    printObjectIf(Laptop("Razer"))
    printObjectIf(Handphone("Sony Ericsson"))
    println()

    printObjectWhen(Laptop("Lenovo"))
    printObjectWhen(Handphone("Maxtron"))
    println()

    printUnsafeString("msiocirm")
//    printUnsafeString(67) // Error
    println()

    printSafeString("mricoism")
    printSafeString(67) // Null
}
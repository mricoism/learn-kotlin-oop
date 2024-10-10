package data

/*
KT.17 - ANY CLASSES
- Di Kotlin, semua class yang kita buat tanpa class Parent, sebenarnya secara otomatis dia akan menjadi class child dari class Any
- Any adalah superclass untuk semua class yang kita buat di Kotlin
 */
class Laptop(val name: String) {

}

open class Handphone(open val name: String) {

}

class Smartphone(override val name: String, val os: String): Handphone(name) {

}
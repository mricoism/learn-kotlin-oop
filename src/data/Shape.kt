package data

open class Shape {
    open val corner: Int = -1
    open fun printName() {
        println("This is Shape")
    }
}

class Rectangle: Shape() {
    /*
    KT.14 - PROPERTIES OVERRIDING
    - Selain membuat ulang function di class Child, di Kotlin juga kita bisa membuat ulang properties
    - Secara standar, properties di class bersifat final, tidak bisa di buat ulang di class Child nya, agar bisa dibuat ulang, kita harus menggunakan kata kunci open
     */
    override val corner: Int = 4
    /*
    KT.15 - SUPER KEYWORD
    - Kadang kita ingin mengakses function atau properties milik class Parent yang sudah dibuat ulang oleh class Child
    - Untuk mengakses function  atau properties milik class Parent, kita bisa menggunakan kata kunci super

     */
    var parentCorner: Int = super.corner
    override fun printName() {
        super.printName()
        println("This is Rectangle")
    }
}

class Triangle: Shape() {
    override val corner: Int = 3

}


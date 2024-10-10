package data

/*
KT.12 - INHERITANCE
- Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
- Dalam artian, kita bisa membuat class Parent dan class Child
- Di Kotlin, tiap class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child
- Secara standar, di class yang dibuat di Kotlin adalah final (tidak bisa diwariskan), agar bisa diwariskan, kita harus menggunakan kata kunci open
 */
open class Employee(val name: String) {
    open fun sayHallo(name: String) {
        println("Haloo... $name, My name is ${this.name}")
    }
}

// mengirim primary constructor param Manager ke primary constructor param Employee
open class Manager(name: String): Employee(name) {
    /*
    KT.13.a - FUNCTION OVERRIDING
    - Function Overriding adalah kemampuan membuat ulang function yang sudah ada di class Parent
    - Secara standar, function di class adalah final, tidak bisa dibuat ulang di class Child
    - Agar function bisa dibuat ulang di class Child, kita harus menggunakan kata kunci open
    KT.13.b - FINAL OVERRIDE FUNCTION
    - Saat kita membuat ulang function di class Child, secara standar, function tersebut bersifat open, yang artinya bisa dibuat ulang di class Child dibawahnya lagi
    - Jika ingin membuat override function tidak bisa dibuat ulang oleh class Child dibawahnya lagi, kita harus menggunakan kata kunci final
     */
    final override fun sayHallo(name: String) {
        println("Haloo... $name, My name is ${this.name}. I am the new Manager")
    }
}
final class CiefTechnicalOperation(name: String): Employee(name) {

    override fun sayHallo(name: String) {
        println("Haloo... $name, My name is ${this.name}. I am the new CTO")
    }
}

class SuperManager(name: String): Manager(name) {
    /*
    //Cannot override bcs its final override function
     override fun sayHallo(name: String) {
        super.sayHallo(name)
    }
     */
}

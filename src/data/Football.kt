package data

/*
KT.32 - INNER CLASS
- Di Kotlin, kita bisa membuat class (Inner) di dalam class (Outer)
- Namun walaupun class Inner tersebut berada di dalam class Outer, namun class Inner tidak bisa mengakses data yang ada di dalam class Outer
- Agar class Inner bisa mengakses data yang ada di dalam class Outer, kita bisa menggunakan kata kunci inner

IMPORTANT!
- kalau menggunakan inner class, maka class yang ada di dalam class di anggap satu kesatuan
- sementara jika tanpa inner class, maka meski ada class di dalam class, tetap di anggap 2 class yg tidak berhubungan
 */

class ManagerV1(val name: String) {
    class Player(val name: String) {
        fun sayHalo() {
            println("Hi there, i am $name")
        }
    }
}

class ManagerV2(val name: String) {
    inner class Player(val name: String) {
        fun sayHalo() {
            println("Hi there, I am $name and my manager is ${this@ManagerV2.name}")
        }
    }
}

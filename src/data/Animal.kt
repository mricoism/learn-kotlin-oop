package data


abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

class Cat: Animal() {
    /*
    KT.23 - ABSTRACT PROPERTY & FUNCTION
    - Saat kita membuat class yang abstract, kita bisa membuat properties abstract dan function abstract di dalam class tersebut
    - Properties dan function yang bersifat abstract, artinya wajib dibuat ulang di class Child nya
     */
    override val name: String = "Cat"
    override fun run(): Unit {
        println("Cat run")
    }
}

class Lion(paramName: String): Animal() {
    override val name: String = paramName
    override fun run(): Unit {
        println("Tiger run")
    }
}

//abstract class Felidae()
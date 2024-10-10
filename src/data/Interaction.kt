package data
/*
KT.26.a - INTERFACE
- Di kotlin, deklarasi type tidak hanya dalam bentuk class, ada juga interface
- Interface adalah blueprint, prototype atau cetakan di Kotlin
- Berbeda dengan Class, Interface tidak bisa langsung dibuat sebagai Object
- Interface hanya bisa diturunkan, dan biasanya Interface digunakan sebagai kontrak untuk class - class turunannya
- Secara standar, semua properties dan function di Interface adalah abstract
 */
interface Interaction {
    val name: String
    fun sayHello(name: String)
    /*
    KT.26.b - CONCRETE FUNCTION ON INTERFACE
    - Function di Interface memiliki pengecualian, tidak harus abstract
    - Kita bisa membuat concrete function di Interface, artinya function tersebut tidak wajib untuk dibuat ulang di child Class nya
     */
    fun askPlace(place: String) {
        println("Do you know where $place is ?")
    }
}
/*
KT.26.c - MULTIPLE INHERITANCE WITH INTERFACE
- Inheritance di Class hanya boleh memiliki satu class Parent
- Di Interface, sebuah class Child bisa memiliki banyak interface Parent
 */
interface Go {
    fun to(place: String)
    fun go() {
        println("Go!")
    }
}

/*
KT.26.d - INHERITANCE BETWEEN INTERFACE
- Tidak hanya Class yang punya kemampuan Inheritance
- Interface juga bisa melakukan Inheritance dengan Interface lain
- Namun Interface tidak bisa melakukan Inheritance dengan Class
 */
interface Work: Interaction, Go {
    fun goToOffice() {
        println("Im going to office at 8:00 PM")
    }
}

/*
KT.26.e - CONFLICT ON INTERFACE
- konflik pada interface terjadi Jika ada 2 interface memiliki 2 nama fungsi yang sama
- Perlu di lakukan override pada class jika terjadi conflict pada interface
- namun kita bisa menggunakan super keyword untuk mengakses fungsi asli yang terjadi konflik dengan <INTERFACE>
- super<MoveB>.move()
 */
interface MoveA {
    fun move() = println("MoveA")
}
interface MoveB {
    fun move() = println("MoveB")
}

class Human(override val name: String): Interaction, Go {
    override fun sayHello(name: String) {
        println("Hello.. $name, My name is ${this.name}")
    }

    override fun to(place: String) {
        println("Weare Going to $place")
    }
}

class Goverment(override val name: String): Work, MoveA, MoveB {
    override fun sayHello(name: String) {
        println("Hello.. $name, My name is ${this.name}")
    }

    override fun to(place: String) {
        println("Weare Going to $place")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}
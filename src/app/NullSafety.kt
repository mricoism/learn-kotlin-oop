package app

/*
KT.44 - NULL SAFETY
- Jika teman-teman sebelumnya pernah belajar bahasa pemrograman Java, di Java kita sering mengenal error bernama NullPointerException. Error ini terjadi ketika kita mengakses properties atau functions di null object
- Di Kotlin, hal ini sangat jarang terjadi, karena sejak awal di Kotlin tidak direkomendasikan untuk menggunakan nullable type.
- Walaupun akan menggunakan nullable type, di Kotlin kita memberitahu secara eksplisit menggunakan karakter ? (tanda tanya)
- Kali ini kita akan bahas cara-cara agar terhindar dari error null di Kotlin sehingga tidak sering kejadian seperti di Java
 */
data class Friend(val name: String)

fun sayHello1(friend: Friend?) {
    println("Heloo.. ${friend?.name}")
}
fun sayHello2(friend: Friend?) {
    val name = friend?.name ?: "Bro"
    println("Heloo.. $name")
}
fun sayHello3(friend: Friend?) {
    if (friend != null) {
        println("Heloo.. ${friend.name}")
    }
}
fun sayHello4(friend: Friend?) {
    println("Heloo.. ${friend!!.name}") // FORCE to trigger Kotlin NullPointerException if null
}

fun main() {
    sayHello1(Friend("Riko"))
    sayHello1(null)
    println()

    sayHello2(Friend("Mail"))
    sayHello2(null)
    println()

    sayHello3(Friend("Korek"))
    sayHello3(null)
    println()

    sayHello3(Friend("Naruto"))
//    sayHello3(null) // ERROR NullPointerException
    println()
}
package app

import data.User

fun main() {
    var user1 = User(1, "Riko", "ASD")
    var user2 = User(2, "Suyadi", "Admin123")
    user1.username = "msiocirm"

    println(user1.id)
    println(user1.username)
    println(user1.password)
    println()

    println(user2.id)
    println(user2.username)
    println(user2.password)
}
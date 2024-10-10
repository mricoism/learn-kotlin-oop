package app

import data.Token

fun main() {
    val accessToken = Token("HASh13hdbjfddadbaib8adba7dbab2n")
    println(accessToken.value)
    println(accessToken.toUpper())
}
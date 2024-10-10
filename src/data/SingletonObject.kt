package data

fun main() {
    println(Utilities.name)
    Utilities.name = "BERUBAH"
    println(Utilities.toUpper("riko"))
    a()
    b()
    c()
    println()

    println(Application.Utilities.toUpper("muhammad"))
}

fun a() {
    println(Utilities.name)
}
fun b() {
    Utilities.name = "Mail"
    println(Utilities.name)
}
fun c() {
    println(Utilities.name)
}
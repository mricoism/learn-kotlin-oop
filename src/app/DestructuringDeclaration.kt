package app

import data.GameV1
import data.GameV2
import data.MinMax
import data.Login

/*
KT.42.b - DESTRUCTURING ON FUNCTION
- Destructuring declarations juga bisa dilakukan ketika memanggil function
- Dengan ini, seakan-akan kita bisa mengembalikan multiple return value pada function
 */
fun limit(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }
}

/*
KT.42.c - LAMBDA PARAMETER
Destructuring juga bisa dilakukan di lambda parameter
Hal ini bisa mempermudah kita saat ingin mengakses data yang ada di parameter
 */
fun reqLogin(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val heat = GameV1("NFS HEAT", 500_000)
    // usual way
    val name1 = heat.name
    val price1 = heat.price
    // using Destructuring declaration
    val (name2, price2) = heat
    println("${name1}, ${price1}")
    println("${name2}, ${price2}")
    println()

    val dota = GameV2("DOTA 2", 0)
    val (name3, price3) = dota
    println("${name3}, ${price3}")
    println()

    val result1 = limit(10, 100)
    println("${result1.min}, ${result1.max}")
    val (min1, max1) = limit(55, 44)
    println("${min1}, ${max1}")
    val (min2, _) = limit(16, 81) // BISA GUNAKAN UNDERSCORE JIKA ADA VALUE YG TIDAK INGIN DI GUNAKAN
    println("${min2}")
    println()

    val fufufafa = Login("FUFUFAFA", "KokTanyaSaya?")
    val hasil = reqLogin(fufufafa) { login ->
        println("${login.username}, ${login.password}")
        login.username == "FUFUFAFA" && login.password == "KokTanyaSaya?"
    }
    println(hasil)
    println()

    val riko = Login("msiocirm", "leclton")
    val hasil2 = reqLogin(riko) { (username, password) ->
        println("$username, $password")
        username == "ajaj" && password == "eeee"
    }
    println(hasil2)


}
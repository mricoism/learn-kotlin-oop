package app

import data.User

/*
KT.19 - toString() FUNCTION
toString() adalah function yang digunakan untuk memberitahu representasi String dari object
Saat kita melakukan println object, sebenarnya function toString() akan dipanggil
Standarnya, function toString() akan mengembalikan referensi kode unik dari object
Kita bisa meng-override function toString() jika ingin mengubah representasi dari String pada object kita

 */
fun main() {
    val player = User(67, "msiocirm", "king123")
    println(player)
    println(player.toString())
}
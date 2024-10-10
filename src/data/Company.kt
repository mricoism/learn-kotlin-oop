package data

class Company(val name: String) {


}

class Team(val name: String) {

    /*
    KT.21 - HASHCODE FUNCTION
    - hashCode adalah function yang digunakan sebagai representasi angka unit untuk objek yang kita buat
    - Function hashCode sangat berguna saat kita ingin mengkonversi objek kita menjadi angka
    - Salah satu penggunaan hashCode yang banyak dilakukan adalah di struktur data, misal untuk memastikan tidak ada data duplicate, agar lebih mudah, di cek nilai hashCode nya, jika hashCode sama, maka dianggap objectnya sama

     */
    override fun hashCode(): Int {
        return name.hashCode()
    }

    /*
    KT.20 - EQUALS
    - Di Kotlin, semua objek bisa dibandingkan menggunakan operasi == atau !=
    - Saat kita membandingkan objek menggunakan operasi == atau !=, sebenarnya Kotlin akan menggunakan function equals milik class Any
    - Untuk mengubah cara membandingkannya, kita bisa meng-override function equals milik class Any
     */
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Team -> other.name == this.name
            else -> false
        }
    }
}


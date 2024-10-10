package data

/*
KT.35 - SINGLETON OBJECT
- Salah satu konsep Design Pattern yang sangat populer adalah singleton object
- Singleton object adalah object yang hanya dibuat satu kali
- Di Kotlin, membuat object singleton sangat mudah, hanya dengan menggunakan kata kunci object
- Cara membuat singleton object di Kotlin sama seperti membuat class
- Singleton object mirip dengan class, bisa extends class ataupun interface
- Namun singleton object tidak memiliki constructors
 */
object Utilities {

    // SINGLETON seperti pada bahasa lain, dia share value ke semua. jadi jika diubah disatu tempat maka akan berubah ke seluruh value singletonnya
    var name: String = "My Utilities"

    fun toUpper(value: String): String {
        return value.uppercase()
    }
}

/*
KT.35.b - INNER OBJECT
- Di Kotlin, singleton object bisa dibuat di dalam sebuah class
- Namun berbeda dengan inner class, singleton object tidak bisa mengakses properties atau function yang ada di outer class nya
 */
class Application(val name: String) {
    object Utilities {
        fun toUpper(value: String): String {
            return value.uppercase()
        }
    }
}
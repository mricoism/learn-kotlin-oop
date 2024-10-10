package data

/*
KT.34.a - ENUM CLASS
- Enum class merupakan representasi dari class yang sudah tetap nilainya
- Biasanya enum class digunakan untuk jenis data yang sudah baku, seperti jenis kelamin, arah mata angin dan sejenisnya
- Untuk membuat enum class, kita bisa menggunakan kata kunci enum sebelum deklarasi class nya
- Kita tidak bisa membuat object dari class enum, namun kita bisa mendeklarasikan langsung object yang tersedia untuk enum class tersebut
 */
enum class Tire {
    Soft, Medium, Hard, Intermediate, Wet
}

/*
KT.34.b - PROPERTIES & FUNCTION ON ENUM
- Enum class adalah class seperti biasa pada umumnya
- Enum class bisa memiliki properties ataupun function
- Namun jika properties nya di set menggunakan constructors, maka saat pembuatan object enum, wajib diisi, dan jika terdapat abstract function, wajib di override pada saat pembuatan object enum
 */
enum class WetTire(val description: String) {
    Inter("Intermediate"),
    Wet("Wet");

    fun showDescription() {
        println(description)
    }
}
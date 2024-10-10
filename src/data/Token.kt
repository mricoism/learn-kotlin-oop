package data

/*
KT.38 - INLINE CLASS
- Kadang kita hanya membuat class dengan satu properties
- Terlalu banyak class akan ada konsekuensinya, yaitu memakan konsumsi memory yang lebih banyak ketika program kita berjalan
- Kotlin memiliki kemampuan untuk mengubah class menjadi inline dengan menggunakan kata kunci inline
- Wajib memiliki 1 Primary Constructor, tidak lebih dan tidak kurang. Wajib 1

Utuk melihat perbedaanya perlu melakukan :
- Pastikan gunakan IntelijIDE
- klik tools -> kotlin -> Show kotlin byteCode
- Akan muncul side bar di kiri.
- Klik Decompile untuk melihat implemen codingan di java
 */
inline class Token(val value: String) {
    fun toUpper(): String = value.uppercase()
}
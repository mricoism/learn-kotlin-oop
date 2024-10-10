package data

/*
KT.30.a - DATA CLASS
- Kadang kita sering membuat class yang hanya digunakan sebagai representasi dari data
- Data Class cocok digunakan dalam hal ini
- Data Class merupakan class yang secara otomatis akan membuatkan function equals, hashCode, toString dan copy dari semua properties yang terdapat di primary constructors yang dimiliki oleh data class
 */
data class Product(val name: String, var price: Int, var category: String)


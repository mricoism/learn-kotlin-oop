package data

// KODE TANPA PRIMARY CONSTRUCTOR
class Address {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    /*
    SECONDARY COSNTRUCTOR
    - Kotlin mendukung pembuatan constructor lebih dari satu
    - Constructor yang utama yang terdapat di Class, disebut primary constructor, constructor tambahan yang bisa kita buat lagi adalah secondary constructor
    - Saat membuat constructor, kita wajib memanggil primary constructor jika ada primary constructor
     */
    constructor(paramStreet: String, paramCity: String) {
        // This is Secondary Constructor 1
        this.street = paramStreet
        this.city = paramCity

        println("Secondary Constructor 1")
    }

    // Dapat mention to Secondary Constructor 1
    constructor(paramStreet: String, paramCity: String, paramCountry: String): this(paramStreet, paramCity) {
        // This is Secondary Constructor 2
        this.country = paramCountry
        println("Secondary Constructor 2")
    }


}
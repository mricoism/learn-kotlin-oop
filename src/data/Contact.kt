package data
/*
KT.24 - SETTER & GETTER
- Di bahasa pemrograman Java, ada sebuah konsep yang bernama Getter dan Setter saat membuat properties
- Getter adalah function yang dibuat untuk mengambil data properties
- Setter ada function untuk mengubah data propertie
- Di kotlin, kita tidak perlu manual untuk membuat function Getter dan Setter nya, karena sudah difasilitasi sehingga lebih mudah
 */
class Contact(name: String) {
    var name: String = name
        get() {
           return field
        }
        set(value) {
            println("isNotBlank : ${value.isNotBlank()}")
            println("isBlank : ${value.isBlank()}")
            println("isBlank : ${value.isEmpty()}")
            if (value.isNotBlank()) {
                field = value
            } else {
                field = "Uknown"
            }
        }
}


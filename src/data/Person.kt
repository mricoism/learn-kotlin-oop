package data

class Person(firstnameParam: String, midNameParam: String?, lastNameParam: String ) {

    init {
        println("Initializer")
    }

    // Jadi Secondary Constructor akan mengirim value param ke Primary Constructor
    constructor(firstnameParam: String, lastNameParam: String) : this(firstnameParam, null, lastNameParam) {
        println("Secondary Constructor")
    }
    // Third Constructor dapat memanggil atau fill up Secondary Constructor
    // Mirip seperti rekursif (third -> secondary - primary)
    constructor(firstnameParam: String): this(firstnameParam, null, "") {
        println("Third Constructor")
    }

    val firstName: String = firstnameParam
    val midName: String? = midNameParam
    val lastName: String = lastNameParam

    /*
    KT.11 - THIS KEYWORD
    - this adalah keyword yang bisa digunakan untuk mereferensikan object saat ini
    - this hanya bisa digunakan di dalam class itu sendiri
    - Biasanya, this digunakan untuk mengakses properties yang tertutup oleh parameter dengan nama yang sama

     */
    fun sayHallo(firstname: String) {
        println("Haloo... $firstname, My name is ${this.firstName}")
    }

    fun run() {
        println("I'm Run")
    }

    fun getFullName(): String {
        if(midName == null || midName == "") {
            return "${firstName} ${lastName}"
        } else {
            return "${firstName} ${midName} ${lastName}"
        }
    }

    /*
    KT.10 - FUNCTION OVERLOADING
    - Function Overloading adalah kemampuan membuat function dengan nama yang sama di dalam class
    - Untuk membuat function dengan nama yang sama, kita wajib menggunakan parameter yang berbeda, bisa tipe parameter yang berbeda, atau jumlah parameter yang berbeda
     */
    fun title(bachelor: String): String {
        if(midName == null || midName == "") {
            return "${firstName} ${lastName} ${bachelor}"
        } else {
            return "${firstName} ${midName} ${lastName} ${bachelor}"
        }
    }
    fun title(bachelor: String, master: String): String {
        if(midName == null || midName == "") {
            return "${firstName} ${lastName} ${bachelor}, ${master}"
        } else {
            return "${firstName} ${midName} ${lastName} ${bachelor}, ${master}"
        }
    }
}
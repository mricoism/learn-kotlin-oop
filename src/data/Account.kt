package data

import kotlin.properties.Delegates

class Account(description: String = "") {
    /*
    KT.40 - LAZY PROPERTY
    - Selain delegating di class, Kotlin mendukung delegating di properties. Namun materi ini tidak akan dibahas disini, karena butuh mengerti dahulu tentang Generic Programming. Materi Delagating di Properties akan dibahas di series Kotlin Generic
    - Salah satu implementasi delegating properties yang sudah disediakan oleh Kotlin adalah, lazy properties
    - Lazy adalah standar library yang telah disediakan agar properties baru diinisialisasi ketika properties itu diakses
    - Lazy Properties hanya di assign 1 kali meski di pakai berulang kali
     */
    //LAZY - malas
    val name: String? by lazy {
        println("Lazy call")
        "Riko"
    }

    //EAGER - ingin
    val age: Int = 20

    /*
    KT.41 - OBSERVABLE PROPERTIES
    - Salah satu standar library yang disediakan oleh Kotlin untuk delegating di properties adalah observable properties
    - Dengan observable properties, kita bisa tahu properties, value sebelum dan value setelah ketika diubah
     */

    var description: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }
}
package data

/*
KT.36 - COMPANION OBJECT
- Companion object adalah kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
- Companion object secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama class nya
- Atau membuat singleton object yang nama objectnya sama dengan sama classnya
 */

class System(val name: String) {
    companion object {
        fun toUpper(value: String): String {
            return value.uppercase()
        }
    }
}
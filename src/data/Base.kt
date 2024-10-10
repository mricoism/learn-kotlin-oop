package data

/*
KT.39.a - DELEGATION
- Salah satu design pattern lain yang populer adalah Delegation
- Delegation sederhananya adalah meneruskan properties atau function ke object yang lain
- Kotlin mendukung delegation tanpa harus membuat kode secara manual
 */
interface Base {
    fun sayHalo(name: String)
    fun sayGoodby(name: String)
}

class MyBase: Base {
    override fun sayHalo(name: String) {
        println("Halo.. $name from My Base")
    }

    override fun sayGoodby(name: String) {
        println("BY!!! $name from My Base")
    }
}

class BaseDelegate(val base: Base): Base {
    override fun sayHalo(name: String) {
        println("say Halo Base Delegate")
        base.sayHalo(name)
    }

    override fun sayGoodby(name: String) {
        println("say BYBY Base Delegate")
        base.sayGoodby(name)
    }
}

// INI Otomatis meng ovveride atau mendelegate seluruh fungsi yang related dengan Base
class ShortDelegate(val base: Base): Base by base

/*
KT.39.b - OVERRIDE DELEGATION
- Dalam delegation, properties dan function secara otomatis akan didelegasikan ke object yang dipilih
- Namun kita tetap bisa meng-override properties dan function jika kita mau
 */
class CertainDelegate(val base: Base): Base by base {
    override fun sayGoodby(name: String) {
        println("BY!!! $name from CERTAIN DELEGATE")
    }
}
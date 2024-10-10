package data

/*
KT.27 - VISIBILITY MODIFIER
- Class, Interface, Constructor, Function, dan Properties (termasuk Getter dan Setter) bisa memiliki Visibility Modifiers di Kotlin
- Ada 4 visibility modifiers di kotlin, yaitu: public, private, protected, internal
- Secara standar visibility modifiers di kotlin adalah public

THE DIFFERENT BETWEEN VISIBILITY
-----------------------------------
Visibility Modifier | Keterangan
-----------------------------------
public              | Jika tidak menyebutkan, maka secara otomatis visibility modifiers nya adalah public, yang artinya bisa diakses dari manapun
private             | Artinya hanya bisa diakses di tempat deklarasinya
protected           | Artinya hanya bisa diakses di tempat deklarasi, dan juga turunannya
internal            | Artinya hanya bisa diakses di module/project yang sama.
-----------------------------------
 */

open class Teacher(val name: String, private var salay: Int) {
    fun teach() {
        println("private teach")
    }
    private fun doPresent() {

    }

    protected fun testProtected() {
        println("teacher Test")
    }
}

class HomeroomTeacher(name: String, salary: Int): Teacher(name, salary) {
//    override doPresent() {} // Error bcs private
    private fun talkToParent() {
        super.testProtected()
    }
}

class Student(val name: String, private var age: Int)
/*
KT.29 - EXTENSION PROPERTIES
- Selain function, kita juga bisa membuat extension untuk properties di Kotlin
- Untuk membuat extension properties, kita bisa membuat properties dengan Getter atau Setter
 */
val Student.upperName : String
    get() = this.name.uppercase()

/*
KT.28.a - EXTENSION FUNCTION
- Pada materi Kotlin Dasar kita sudah membahas tentang Extension Function, yaitu menambahkan function pada tipe data yang sudah ada
- Perlu diperhatikan, bahwa saat membuat extension function, kita tidak memodifikasi class aslinya
- Extension function hanyalah sebuah function bantuan yang artinya, kita tidak bisa mengakses data private atau protected dari class tersebut
 */
fun Student.introduceSelf(hobies: String) {
    //cannot access age bcs its private
    println("Hi.. Everyone, my name is ${name}. my hobies is  $hobies")
}
/*
KT.28.b - NULLABLE EXTENSION FUNCTION
- Secara standar, extension function hanya bisa untuk data yang tidak null
- Jika kita ingin membuat extension function yang bisa digunakan untuk data yang bisa null, kita perlu menggunakan kata kunci ? (tanda tanya)
 */
fun Student.sayHalo(name: String) {
    if (this != null) {
        println("Halo.. $name, My name is ${this.name}")
    }

}
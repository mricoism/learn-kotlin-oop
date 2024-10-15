package app

import data.Student

/*
KT.49 - SCOPE FUNCTION
- Kotlin memiliki standar library yang berisikan beberapa function yang bisa digunakan untuk mengeksekusi object dengan mudah memanfaatkan lambda expression
- Function-function tersebut adalah let, run, with, apply, dan also

LET FUNCTION
- Let function bisa digunakan sebagai reference block agar kita bisa lebih mudah ketika ingin memanipulasi sebuah object
- Let function memiliki parameter object itu sendiri, sehingga kita bisa menggunakan kata kunci it untuk mendapatkan referensi terhadap object tersebut

RUN FUNCTION
- Run function mirip dengan let function
- Yang membedakan adalah, pada run function, tidak ada parameter pada lambda nya, sehingga kita tidak bisa mengakses reference object menggunakan kata kunci it. Namun kita masih bisa menggunakan kata kunci this

APPLY FUNCTION
- Apply function hampir sama dengan run function
- Yang membedakan adalah return value dari apply function ada reference object itu sendiri

ALSO FUNCTION
- Also function mirip dengan let function
- Yang membedakan adalah, pada also function, return value nya adalah reference ke object itu sendiri

WITH FUNCTION
- With function mirip dengan run function, menggunakan reference this
- Yang membedakan adalah, with function bukanlah extension function, jadi tidak bisa digunakan langsung dari object-nya
- Kita harus memanggil with function secara manual

SUMMARY
----------------------------------------------------------------------------
Function    | Object Reference  | Return Value      | Is Extension Function
----------------------------------------------------------------------------
let         | it                | lambda result     | yes
run         | this              | lambda result     | yes
run         | -                 | lambda result     | No: Called without context object
with        | this              | lambda result     | No: Called without context object
apply       | this              | context result    | yes
also        | it                | context result    | yes
 */

fun main() {
    val student = Student("Riko", 19)

    val result1 = student.let {
        "Name ${it.name}"
    }
    println(result1)

    val result2 = student.run {
        "Name ${this.name}"
    }
    println(result2)


    val result3 = student.apply {
        "Name ${this.name}"
    }
    println(result3)

    val result4 = student.also {
        "Name ${it.name}"
    }
    println(result4)

    val result5 = with(student) {
        "Name ${this.name}"
    }
    println(result5)

}


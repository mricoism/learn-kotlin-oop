package app


import data.Action

fun fireAction(action: Action) {
    action.doAction()
}

class SampleAction: Action {
    override fun doAction() {
        println("doAction Sample Action Class")
    }
}

fun main() {
    fireAction(SampleAction())

    /*
    KT.33 - ANONYMOUS CLASS
    - Saat kita ingin membuat object, maka kita diwajibkan untuk menggunakan deklarasi class yang  lengkap
    - Namun, Kotlin mendukung pembuatan object dari class yang bahkan belum lengkap
    - Bahkan, di Kotlin, kisa bisa membuat object dari interface
    - Kemampuan ini dinamakan anonymous class
    - Untuk membuat anonymous class, kita bisa menggunakan kata kunci object diikuti dengan deklarasi class Child seperti pada pewarisan

     */
    fireAction(object : Action {
        override fun doAction() {
            println("doAction Annonymous class 1")
        }
    })

    fireAction(object : Action {
        override fun doAction() {
            println("doAction Annonymous class 2")
        }
    })


}
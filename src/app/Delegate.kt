package app

import data.BaseDelegate
import data.MyBase
import data.ShortDelegate
import data.CertainDelegate

fun main() {
    val base = MyBase()
    base.sayHalo("Muhammad")
    println()

    val delegate = BaseDelegate(base)
    delegate.sayHalo("Mail")
    delegate.sayGoodby("Riko")
    println()

    val shortDelegate = ShortDelegate(base)
    shortDelegate.sayHalo("Mail 2")
    shortDelegate.sayGoodby("Riko 2")
    println()

    val certainDelegate = CertainDelegate(base)
    certainDelegate.sayGoodby("Riko 3")
    println()
}
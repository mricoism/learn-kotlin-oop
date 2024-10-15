package app

/*
KT.50 - POLYMORPHISM
- Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
- Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
- Polymorphism erat hubungannya dengan Inheritance
 */

import data.CiefTechnicalOperation
import data.Employee
import data.Manager

fun main() {
    var employee = Employee("Riko")
    employee.sayHallo("mail")

    employee = Manager("Mail")
    employee.sayHallo("Riko")

    employee = CiefTechnicalOperation("masiko")
    employee.sayHallo("Mail")
}
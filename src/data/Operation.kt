package data

/*
KT.31.a - SEALED CLASS
- Sealed class merupakan jenis class yang didesain untuk inheritance
- Sealed class tidak bisa diinstansiasi menjadi object, dan secara standar sealed class merupakan abstract class
- Sealed class sangat cocok digunakan sebagai class Parent
 */
sealed class Operation(val name: String)
class Plus: Operation("Add")
class Minus: Operation("Minus")
class Modulo: Operation("Modulo")

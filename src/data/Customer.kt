package data

// kalau buat primary constructor maka wajib memanggil primary constructor yang ada di parentnya


// QUESTION ? Apakah jika tidak membuat primary constructor, namum mambuat Secondary constructor. tetap di wajibkan mention (this) / mengirimkan data ke primary ? yang bahkan tidak di buat ?

// Kalau punya primary constructor, tidak boleh tiba2 atau langsung mention / menggunakan Super Constructor
// Kalau kita punya primary constructor. maka tidak bisa menggunakan kata kunci super constructor




/*
KT.16 - SUPER CONSTRUCTOR
- Kata kunci super tidak hanya bisa digunakan untuk mengakses function atau properties di class Parent
- Kata kunci super juga bisa digunakan untuk mengakses constructor class Parent
- Mengakses constructor class Parent hanya bisa dilakukan di dalam constructor class Child
 */

open class Customer(val name: String, val type: String, val balance: Int) {
    constructor(name: String, type: String): this(name, type, 0){

    }
    constructor(name: String): this(name, "Standart") {

    }
}

// ada 2 solusi

// 1
class PremiumCustomer: Customer {
    constructor(name: String): super(name, "Premium") {
    }
    constructor(name: String, balance: Int): super(name, "Premium", balance){}
}

// 2
class ExecutiveCustomer(name: String, balance: Int): Customer(name, "Executive", balance) {
    constructor(name: String): this(name, 0) {}
}
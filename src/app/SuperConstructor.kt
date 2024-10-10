package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Riko")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Suyadi", 1000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}
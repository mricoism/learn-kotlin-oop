package app

import data.Company
import data.Team

fun main() {
    val company1 = Company("Apple")
    val company2 = Company("Apple")
    val company3 = company1
    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
    println(company1.hashCode() == company3.hashCode())
    println()

    val team1 = Team("Manchester City")
    val team2 = Team("Manchester City")
    println(team1.hashCode())
    println(team2.hashCode())
    println(team1.hashCode() == team2.hashCode())
}
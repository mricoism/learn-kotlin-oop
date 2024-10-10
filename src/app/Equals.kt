package app

import data.Company
import data.Team


fun main() {
    val company1 = Company("Apple")
    val company2 = Company("Apple")
    val company3 = company1
    println(company1 == company2)
    println(company1 == company3)
    println()

    val team1 = Team("Manchester City")
    val team2 = Team("Manchester City")
    println(team1 == team2)


}
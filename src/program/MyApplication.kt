package program

import annotation.Fancy

@Fancy(author = "Riko")
class MyApplication(val name: String, val version: Int) {
    fun info(): String = "Application $name-$version"
}
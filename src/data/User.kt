package data


/*
KT.08 - PROPERTIES IN CONSTRUCTOR
- Kotlin mendukung deklarasi properties langsung di primary constructor
- Ini sangat berguna untuk mempersingkat saat kita ingin membuat properties, dan mengisi datanya lewat constructor
 */
class User(val id: Int, var username: String, var password: String) {
    override fun toString(): String {
        return "User with username: $username"
    }
}
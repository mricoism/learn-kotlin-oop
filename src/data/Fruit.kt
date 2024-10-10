package data

/*
KT.43 - OPERATOR OVERLOADING
- Kotlin mendukung operator overloading, artinya kita bisa membuat function dari operator-operator seperti operator matematika, dan lain-lain
- Kemampuan ini membuat kita bisa melakukan operasi apapun di object seperti layaknya tipe data Integer
- Ada banyak sekali operator yang bisa di override di Kotlin


UNARY PREFIX OPERATOR
-------------------------------
Expression  | Translated to
-------------------------------
+a          | a.unaryPlus()
-a          | a.unaryMinus()
!a          | a.not

INCREMENT & DECREMENT
-------------------------------
Expression  | Translated to
-------------------------------
a++         | a.inc() + see below
a--         | a.dec() + see below

ARITMATIC OPERATOR
-------------------------------
Expression  | Translated to
-------------------------------
a + b       | a.plus(b)
a - b       | a.minus(b)
a * b       | a.times(b)
a / b       | a.div(b)
a % b       | a.rem(b), a.mod(b) (deprecated)
a..b        | a.rangeTo(b)

IN OPERATOR
-------------------------------
Expression  | Translated to
-------------------------------
a in b      | b.contains(a)
a !in b     | !b.contains(b)

INDEX ACCESS OPERATOR
------------------------------------------
Expression              | Translated to
------------------------------------------
a[i]                    | a.get(i)
a[a, j]                 | a.get(i, j)
a[i_1, ..., 1_n]        | a.get(i_1, ..., 1_n)
a[i] = b                | a.set(i, b)
a[i, j] = b             | a.set(i, j, b)
a[i_1, ..., i_n] = b    | a.set(i_1, ..., 1_n, b)

INVOKE OPERATOR
-------------------------------------
Expression          | Translated to
-------------------------------------
a()                 | a.invoke()
a(j)                | a.invoke(j)
a(i, j)             | a.invoke(i, j)
a(i_1, ..., i_n)    | a.invoke(i_1, ..., i_n)

ASSIGNMENT OPERATOR
-------------------------------
Expression  | Translated to
-------------------------------
a += b      | a.plusAssign(b)
a -= b      | a.minusAssign(b)
a *= b      | a.timesAssign(b)
a /= b      | a.divAssign(b)
a %= b      | a.remAssign(b), a.modAssign(b) (deprecated)

EQUALITY DAN INEQUALITY OPERATOR
-------------------------------
Expression  | Translated to
-------------------------------
a == b      | a?.equals(b) ?: (a === null)
a != b      | !(a?.equals(b) ?: (a === null))

COMPARISON OPERATOR
-------------------------------
Expression  | Translated to
-------------------------------
a > b       | a.compareTo(b) > 0
a < b       | a.compareTo(b) < 0
a >= b      | a.compareTo(b) >= 0
a <= b      | a.compareTo(b) <= 0

CREATING OPERATOR OVERLOADING
Untuk membuat operator overloading, kita bisa menggunakan kata kunci operator sebelum deklarasi function nya


 */

class Fruit (val quantity: Int) {
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(this.quantity + fruit.quantity)
    }

    operator fun minus(fruit: Fruit): Fruit {
        return Fruit(this.quantity - fruit.quantity)
    }

    operator fun compareTo(fruit: Fruit) : Int {
        return quantity.compareTo(fruit.quantity)
    }
}

package data


/*
KT.22 - ABSTRACT CLASS
- Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract
- Abstract class artinya, class tersebut tidak bisa dibuat sebagai object, hanya bisa diturunkan
 */
abstract class Location(var latitude: String, var longitude: String) {
}

class City(latitude: String,longitude: String): Location(latitude, longitude) {
}

class Country(latitude: String,longitude: String): Location(latitude, longitude) {

}

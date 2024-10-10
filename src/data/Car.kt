package data

// default value di letakkan di akhir
class Car(paramBrand: String, paramName: String, paramYear: Int, paramType: String = "Sport") {
    val brand: String = paramBrand
    val name: String = paramName
    val type: String = paramType
    var year: Int = paramYear
    var oldCar: Boolean? = null

    init {
        println("Initializer Block $paramName")
        if (paramYear > 2010) {
            oldCar = false
        } else {
            oldCar = true
        }
    }

}
package annotation

@Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

/*
KT.47 - ANNOTATION TARGET
- Kotlin Annotation berjalan baik dengan Java Annotation
- Namun kadang kita ingin menempatkan posisi annotation sesuai dengan yang kita mau agar bisa terbaca di Java dengan baik
- Biasanya kejadian ini terjadi ketika kita menggunakan Kotlin, namun menggunakan framework Java, sehingga target lokasi Annotation nya harus sesuai dengan yang biasa digunakan framework tersebut di Java
- Di kotlin kita bisa menggunakan @target:NamaAnnotation nya untuk menentukan lokasi target Annotation akan ditempatkan dimana
 */
class ExampleTarget(
//    @Beta val firstName: String, // Default akan di tempatkan di parameter di (compile java)
    @field:Beta val firstName: String,
    @get:Beta val midName: String,
    @param:Beta val lastName: String)

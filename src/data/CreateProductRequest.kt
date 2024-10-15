package data

/*
KT.48 - REFLECTION
- Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan
- Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga bisa meng-otomatisasi pekerjaan
- Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan kata kunci ::class, atau bisa langsung dari NamaClass::class
 */
import annotation.NotBlank

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    val price: Int
) {
}

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
) {
}
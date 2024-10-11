package app

import exception.ValidationException

fun validateTokenV1(token: String) {
    if (token.isBlank()) {
        throw ValidationException("Token is Blank")
    }
    println("Your Token is valid")
}



fun main() {
    validateTokenV1("gdcd7heod7w0fw92d72jfsihfs2")
//    validateTokenV1("") // Error
    println()

    /*
    KT.45.b - TRY CATCH
    - Jika dalam program Kotlin kita terjadi exception, maka secara otomatis program kita akan terhenti
    - Kadang kita tidak ingin sampai kejadian seperti itu
    - Di Kotlin, kita bisa menangkap exception, lalu melakukan sesuatu jika terjadi error
    - Try Catch di Kotlin digunakan untuk mencoba melakukan sesuatu, jika terjadi error maka akan ditangkap dan kita bisa memberi reaksi sesuai dengan yang kita mau
     */
    try {
        validateTokenV1("gda2ud73vd3v6dsj8v")
        validateTokenV1("")
        println("Test 1")
    } catch (error: ValidationException) {
        println("Error with message: ${error.message}")
    }
    /*
    KT.45.c - MULTIPLE CATCH
    - Saat kita mengeksekusi sebuah kode program di blok Try, bisa dimungkinan tidak hanya terjadi satu jenis exception, bisa saja terjadi beberapa jenis exception
    - Di Kotlin, kita bisa menggunakan multiple block Catch, untuk menangkap jenis exception yang berbeda
     */
    catch (error: NullPointerException) {
        println(error.message)
    } catch (error: Exception) {
        println(error.message)
    } finally {
        /*
        KT.45.d - FINALLY
        Finally adalah block kode yang bisa ditambahkan di Try Catch
        Block finally akan selalu dieksekusi setelah kode program Try Catch di eksekusi, baik itu sukses ataupun gagal
        Ini cocok untuk menempatkan kode yang memang harus dilakukan tidak peduli baik itu kodenya sukses atau gagal
         */
        println("Finally Always be Excecuted")
    }


}
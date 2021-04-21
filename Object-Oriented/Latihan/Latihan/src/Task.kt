/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

class Cat(private val name: String) {
    // TODO 1
    var sleep: Boolean = false
        get()=field
        set(value) {
            field=value
        }
    fun toSleep() {
        val message = when(sleep){
            true->"$name, sleep!"
            else->"$name, let's play!"
        }
        println(message)
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    println("Fungsi getter dipanggil")
    gippy.toSleep()
    println("Fungsi setter dipanggil")
    gippy.sleep = true
    println("Fungsi getter dipanggil")
    gippy.toSleep()
}
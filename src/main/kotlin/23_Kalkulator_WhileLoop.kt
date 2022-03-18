fun main() {
    println("Selamat datang di kalkulator kami")
    var goOn = "ya"
    while (goOn == "ya") {
        println("Masukkan nomor pertama")
        val a = readLine()!!.toDouble()
        println("Masukkan nomor kedua:")
        val b = readLine()!!.toDouble()
        println("Pilih salah satu dari operasi berikut:")
        println("1 - tambahan")
        println("2 - pengurangan")
        println("3 - perkalian")
        println("4 - pembagian")
        val choice = readLine()!!.toInt()
        var result: Double = 0.0
        when (choice) {
            1 -> result = a + b
            2 -> result = a - b
            3 -> result = a * b
            4 -> result = a / b
        }
        if ((choice > 0) && (choice < 5)) {
            println("Result: $result")
        } else {
            println("Pilihan tidak valid")
        }
        println("Apakah Anda ingin membuat perhitungan lain? [ya tidak]")
        goOn = readLine()!!
    }
    println("Terima kasih telah menggunakan kalkulator kami.")
}
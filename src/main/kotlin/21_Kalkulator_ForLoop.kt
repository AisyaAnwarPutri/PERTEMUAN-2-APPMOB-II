fun main() {
    println("Kalkulator Eksponen")
    println("===================")
    println("Masukkan basis: ")
    val a = readLine()!!.toInt()
    println("Masukkan eksponen: ")
    val n = readLine()!!.toInt()
    var result = a
    for (i in 1..n-1) {
        result = result * a
    }
    println("Hasil: $result")
    println("Terima kasih telah menggunakan kalkulator eksponen kami")
}
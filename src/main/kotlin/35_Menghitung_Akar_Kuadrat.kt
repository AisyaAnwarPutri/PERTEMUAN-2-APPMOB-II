import kotlin.math.sqrt

fun main() {
    //menghitung akar kuadrat
//sqrt() adalah singkatan dari SQuare Root,
    print("Masukkan beberapa angka dan saya akan menghitung akar kuadrat: ")
    val a = readLine()!!.toDouble()
    if (a > 0) {
        println("Angka yang Anda masukkan lebih besar dari 0, jadi saya bisa menghitungnya!")
        val root = sqrt(a);
        println("Akar kuadrat dari $a adalah $root")
    } else
        println("Saya tidak bisa menghitung akar kuadrat dari angka negatif!")
    println("Terima kasih atas masukannya")
}
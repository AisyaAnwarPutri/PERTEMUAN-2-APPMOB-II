fun main() {
    println("Tabel perkalian sederhana menggunakan loop:")
    for (i in 1..10) {
        print("$i ")
    }
    println()
    for (i in 1..10) {
        print("${i * 2} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 3} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 4} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 5} ")
    }
    println()
    for (i in 1..10) {

        print("${i * 6} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 7} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 8} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 9} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 10} ")
    }
    println("\n\nBerikut tabel perkalian sederhana menggunakan loop bersarang:")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println()
    }
}
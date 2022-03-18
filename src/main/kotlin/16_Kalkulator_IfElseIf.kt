fun main() {
    println("Welcome to our calculator")
    println("Enter the first number:")
    val a = readLine()!!.toDouble()
    println("Enter the second number:");
    val b = readLine()!!.toDouble()
    println("Choose one of the following operations:")
    println("1 - Pertambahan")
    println("2 - Pengurangaan")
    println("3 - Perkalian")
    println("4 - Pembagian")
    val choice = readLine()!!.toInt()
    var result = 0.0
    if (choice == 1) {
        result = a + b

    } else if (choice == 2) {
        result = a - b
    } else if (choice == 3) {
        result = a * b
    } else if (choice == 4) {
        result = a / b
    }
    if ((choice > 0) && (choice < 5)) {
        println("Hasil: $result")
    } else {
        println("Invalid choice")
    }
    println("Terimakasih telah menggunakan kalkulator ini")
}
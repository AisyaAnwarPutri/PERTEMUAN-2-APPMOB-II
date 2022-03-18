fun main() {
    //While Loop
    println("While Loop")
    var x:Int = 0
    println("Contoh Perulangan While--")
    while(x <= 10) {
        print("$x ")
        x++
    }
    print('\n')
//Do-While Loop
    println("Do-While Loop")
    var y:Int = 0
    do {
        y = y + 10
        println("Saya di dalam blok Do---" +y)
    } while(y <= 50)
}
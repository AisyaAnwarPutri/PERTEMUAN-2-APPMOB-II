fun main() {
    //Elvis Operator ?:
    var maybeWelcome: String? = "Hello world"

    println(maybeWelcome?.length ?: 0)
}
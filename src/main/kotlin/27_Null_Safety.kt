fun main() {
    //Nullable types
    //pemberian nilai null yang diizinkan:
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}
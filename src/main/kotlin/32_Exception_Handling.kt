fun main() {
    try {
        val myVar:Int = 10;
        val v:String = "Rekayasa Perangkat Lunak";
        v.toInt();
    } catch(e:Exception) {
        e.printStackTrace()
    } finally {
        println("Penanganan Pengecualian di Kotlin");
    }
}
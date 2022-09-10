fun main() {
    val string = readLine()!!
    val n = readLine()!!.toInt()
    println(string.split("\\s+".toRegex(), n).joinToString("\n"))
}
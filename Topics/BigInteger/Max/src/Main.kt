fun main() {
    val (a, b) = Array(2) { readLine()!!.toBigInteger() }
    println((a + b + (a - b).abs()) / 2.toBigInteger())
}
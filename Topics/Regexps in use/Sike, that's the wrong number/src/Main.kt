fun main() {
    val number = readln()
    println(number.replace("[a-zA-Z]".toRegex(), ""))
}
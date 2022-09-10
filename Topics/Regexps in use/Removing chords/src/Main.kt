fun main() {
    val text = readln()
    val regex = "(Am|A|Em|E|Dm|D|G|C)\\s+".toRegex()
    println(text.replace(regex, ""))
}
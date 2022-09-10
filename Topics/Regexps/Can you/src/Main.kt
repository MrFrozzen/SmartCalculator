fun main() {
    val answer = readln()
    val str = Regex("I can.?.? do my homework on time!")
    println(answer.matches(str))
}
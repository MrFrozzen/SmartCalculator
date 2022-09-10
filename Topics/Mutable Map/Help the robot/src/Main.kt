fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>): MutableMap<String, Int> {
    val map = purchases.toMutableMap()
    for ((k, v) in addition) {
        map[k] = (map[k] ?: 0) + v
    }
    return map
}
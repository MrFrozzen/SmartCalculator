fun makeMyWishList(wishList: Map<String, Int>, limit: Int): MutableMap<String, Int> {
    return wishList.filterValues { it <= limit }.toMutableMap()
}
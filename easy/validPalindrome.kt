package leetcode.easy

fun isPalindrome(s: String): Boolean {
    val filteredStr = Regex("[^a-zA-Z0-9]*").replace(s, "").toLowerCase()
    var left=0
    var right=filteredStr.length-1

    for (index in filteredStr.indices) {
        val leftChar = filteredStr[left]
        val rightChar = filteredStr[right]
        if (leftChar != rightChar) {
            return false
        }
        left++
        right--
    }

    return true
}
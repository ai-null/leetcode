// https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
fun removeDigit(number: String, digit: Char): String {
    var prev = ""
    for (i in number.indices) {
        if (digit == number[i]) {
            val removed = "${number.substring(0, i)}${number.substring(i+1, number.length)}"
            if (removed>prev) prev = removed
        }
    }
    return prev
}
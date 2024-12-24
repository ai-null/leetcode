// https://leetcode.com/problems/sqrtx/description/
fun mySqrt(x: Int): Any {
    if (x < 2) return x

    var high = x
    var low = 0

    while (low <= high) {
        val result = (low + high) / 2
        val resultSquared: Long = result.toLong() * result.toLong()
        if (resultSquared == x.toLong()) {
            return result.toInt()
        } else if (resultSquared < x.toLong()) {
            low = result+1
        } else {
            high = result-1
        }
    }

    return low-1
}
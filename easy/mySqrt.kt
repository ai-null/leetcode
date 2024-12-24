// https://leetcode.com/problems/sqrtx/description/
fun mySqrt(x: Int): Any {
    val prec: Double = 10E-15
    var i : Double = (x / 2).toDouble()

    var d: Double = i
    var nx: Double = 0.0
    while (abs(i) > prec) {
        nx = x - (i*i - x)/(2*i)
        d = nx - i
        i = nx
    }

    return nx
}
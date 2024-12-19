package leetcode.easy

/**
 * https://leetcode.com/problems/n-th-tribonacci-number/
 *
 * The Tribonacci sequence Tn is defined as follows:
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 * Given n, return the value of Tn.
 */
fun tribonacci(n: Int): Int {
    if (n < 2) {
        return n
    }
    var fold = 3
    var n1 = 0
    var n2 = 1
    var n3 = 1

    while (fold <= n) {
        var next = n1 + n2 + n3
        n1 = n2
        n2 = n3
        n3 = next
        fold++
    }

    return n3
}
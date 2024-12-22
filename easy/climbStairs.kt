fun climbStairs(n: Int): Int {
    // TODO: REWRITE USING DP
    var index = 0

    var a = 0
    var b = 1
    while (index < n) {
        var temp = a+b

        // 

        a = b
        b = temp
        index++
    }

    return b
}

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
fun finalValueAfterOperations(operations: Array<String>): Int {
    var fold = 0

    for (num in operations) {
        if (num[1] == '-') {
            fold--
        } else fold++
    }

    return fold
}
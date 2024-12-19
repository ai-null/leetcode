package leetcode.easy

/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 *
 * You are given an m x n integer `matrix` matrix with the following two properties:
 *
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 *
 * You must write a solution in O(log(m * n)) time complexity.
 */

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    // Attempt 1, too over complicated
    val last = matrix[0].size - 1

    fun bs(low: Int, high: Int): Int? {
        if (low > high) return null

        val middle = (low + high) / 2
        val row = matrix[middle]

        if (row[0] <= target && row[last] >= target) {
            return middle
        } else if (row[last] < target) {
            // too high
            return bs(middle+1, high)
        } else {
            return bs(low, middle-1)
        }
    }

    val rowIndex: Int? = bs(0, matrix.size - 1)
    if (rowIndex == null) return false

    for (num in matrix[rowIndex]) {
        if (num == target) return true
    }

    return false
}
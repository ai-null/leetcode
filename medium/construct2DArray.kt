package leetcode.medium

/**
 * https://leetcode.com/problems/convert-1d-array-into-2d-array/
 *
 * You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n.
 * You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.
 *
 * The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array,
 * the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.
 *
 * Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.
 */

fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
    if (original.size % n != 0 || original.size / n != m) return emptyArray()

    val result = Array<IntArray>(size = m) { IntArray(n) }

    var fold = 0
    for (row in 0 until m) {
        for (col in 0 until n) {
            result[row][col] = original[fold]
            fold++
        }
    }

    return result
}
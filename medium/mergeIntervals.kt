package leetcode.medium

/**
 * https://leetcode.com/problems/merge-intervals/description/
 * Given an array of intervals where intervals[i] = [starti, endi], 
 * merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 */
fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val result = mutableListOf<IntArray>()
    intervals.sortBy { it.first() }

    result.add(intervals[0])
    for (index in 1 until  intervals.size) {
        val last: IntArray = result[result.size - 1]
        val curr: IntArray = intervals[index]

        // overlap
        if (curr[0] <= last[1]) {
            last[1] = maxOf(last[1], curr[1]);
        } else {
            result.add(intervals[index])
        }
    }

    return result.toList().toTypedArray()
}
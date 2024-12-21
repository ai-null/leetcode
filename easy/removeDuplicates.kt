// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

fun removeDuplicates(nums: IntArray): Int {
    var prevIndex = 1
    var prev = nums[0]

    for (index in nums.indices) {
        if (nums[index] != prev) {
            prev = nums[index]
            nums[prevIndex] = nums[index]
            prevIndex++
        }
    }

    return prevIndex
}
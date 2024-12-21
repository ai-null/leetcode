// https://leetcode.com/problems/move-zeroes/
fun moveZeroes(nums: IntArray): Unit {
    var fold = 0
    for (index in nums.indices) {
        if (nums[index] != 0) {
            if (fold != index) {
                nums[fold] = nums[index]
                nums[index] = 0
            }

            fold++
        }
    }
}
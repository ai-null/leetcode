// https://leetcode.com/problems/sort-array-by-parity/
fun sortArrayByParity(nums: IntArray): IntArray {
    val result = IntArray(nums.size) {0}

    var left = 0
    var right = nums.size - 1
    for (index in nums.indices) {
        if (nums[index] % 2 == 0) {
            result[left] = nums[index]
            left++
        } else {
            result[right] = nums[index]
            right--
        }
    }

    return result
}
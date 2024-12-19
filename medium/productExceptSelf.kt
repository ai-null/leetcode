/*
https://leetcode.com/problems/product-of-array-except-self/description/

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.*/

fun productExceptSelf(nums: IntArray): IntArray {
    val product = IntArray(nums.size)
    var leftFold = 1
    for (index in nums.indices) {
        product[index]=leftFold
        leftFold*=nums[index]
    }

    var rightFold = 1
    for (index in nums.indices.reversed()) {
        product[index] *= rightFold
        rightFold *= nums[index]
    }

    return product 
}
#include <utility>
#include <vector>
#include <iostream>

vector<pair<int, int>> getFinalState(vector<int>& nums, int k, int multiplier) {
    while (k--)
    {
        auto num = min_element(nums.begin(), min.end());
        *num *= multiplier;
    }
    
    return nums;
}
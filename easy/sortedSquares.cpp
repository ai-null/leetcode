vector<int> sortedSquares(vector<int>& nums) {
    int l = 0, n = nums.size(), r = n-1, i = n-1;
    vector<int> out(n);
    while(l <= r)
    {
        if(abs(nums[r]) >= abs(nums[l])) {
            out[i--] = nums[r]*nums[r];
            r--;
        } else {
            out[i--] = nums[l]*nums[l];
            l++;
        }
    }
    return out;
}

vector<int> sortedSquares(vector<int>& nums) {
    for (int i = 0; i < nums.size(); i++)
    {
        nums[i] = abs(nums[i]);
    }
    
    std::sort(nums.begin(), nums.end());

    return nums;
}
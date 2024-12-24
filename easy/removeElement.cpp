int removeElement(vector<int>& nums, int val) {
    int fold = 0;

    for (int i = 0; i < nums.size(); i++) {
        if (nums[i] != val) {
            if (fold != i) {
                nums[fold] = nums[i];
            }
            fold++;
        }
    }

    return fold;
}
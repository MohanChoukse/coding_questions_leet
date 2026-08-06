class Solution {
    public int findMin(int[] nums) {
        int r = nums.length - 1;
        int l = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[r] >= nums[l]) {
                return nums[l];
            } else if (nums[m] > nums[r]) {
                l = m + 1;
            } else if (nums[m] < nums[r]) {
                r = m;
            } else if (nums[l] == nums[m] && nums[m] == nums[r]) {
                l++;
                r--;
            }
        }
        return -1;
    }
}
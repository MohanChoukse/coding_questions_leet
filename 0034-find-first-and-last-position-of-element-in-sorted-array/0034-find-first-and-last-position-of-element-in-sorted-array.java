class Solution {
    public int[] searchRange(int[] nums, int target) {
          int right = nums.length - 1;
        int left = 0;
        int  first =-1;
        int second =-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
               first = mid;
               right = mid -1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

 right = nums.length - 1;
         left = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
               second = mid;
               left = mid +1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{first, second};
    }
}
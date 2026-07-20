class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (j > i) {
            int num1 = nums[i];
            int num2 = nums[j];

            if (num1 + num2 == target) {
                return new int[] { i + 1, j + 1 };
            } else if (num1 + num2 > target) {
                j--;
            } else if (num1 + num2 < target) {
                i++;
            }
        }

        return new int[] {  };

    }

}
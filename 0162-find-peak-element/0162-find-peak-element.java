class Solution {
    public int findPeakElement(int[] nums) {
        int r = nums.length-1;
        int l =0;

        while(l<r){
            int m = l +(r-l)/2;
            if(nums[m+1] > nums[m]){
                l = m+1;
            }
             if(nums[m+1] < nums[m]){
               
                r = m;
            }
        }
     return l;   
    }
}
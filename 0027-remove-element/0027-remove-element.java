class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i, k=0;
        for( i=0; i<n; i++){
           if(nums[i]!= val){
            nums[k]=nums[i];
            k+=1;
           } 


        }

        return k;
    }
}
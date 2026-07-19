class Solution {
    public void sortColors(int[] nums) {
        int n =nums.length-1;
              int lo = 0;
              int hi = n ;
              int mid = 0;

              while(mid<=hi){
                if(nums[mid] == 0){
                    int tmp = nums[lo];
                    nums[lo++] = nums[mid];
                    nums[mid++] = tmp;
                }
                else if(nums[mid]==1){
                    mid++;
                }
                else{
                    int tmp = nums[mid];
                    nums[mid]= nums[hi];
                    nums[hi--]= tmp;
                }
              }                        
    }
}
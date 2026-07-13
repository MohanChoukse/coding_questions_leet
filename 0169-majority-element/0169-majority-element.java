class Solution {
    public int majorityElement(int[] nums) {
        // int count = 0;
        // int candidate = 0;

        // for (int num : nums) {
        //     if (count == 0) {
        //         candidate = num;
        //     }
        //     if (num == candidate) {
        //         count += 1;
        //     } else {
        //         count -= 1;
        //     }
        // }

        // return candidate;




        // HashMap Code
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            // if(map.containsKey(nums[i])){
            //     map.put(nums[i], map.get(nums[i]) + 1);
            // }else{
            //     map.put(nums[i], 1);
            // }

            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }

        // Set<Integer> keySet =  map.keySet();
        for(Integer key : map.keySet() ){
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        return -1;
    }
}

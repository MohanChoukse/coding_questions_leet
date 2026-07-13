import java.util.HashSet;

class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        // union code
        // for (int i = 0; i < arr1.length; i++) {
        //     set.add(arr1[i]);
        // }

        // for (int i = 0; i < arr2.length; i++) {
        //     set.add(arr2[i]);
        // }

        // int[] ans = new int[set.size()];
        // int index = 0;

        // for (int num : set) {
        //     ans[index++] = num;
        // }

        // return ans;

        // intersection

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

      
        int[] ans = new int[set.size()];
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
              
              
                ans[index++] = arr2[i];
               
                set.remove(arr2[i]);

            }
        }
            return Arrays.copyOf(ans, index);
    }
}
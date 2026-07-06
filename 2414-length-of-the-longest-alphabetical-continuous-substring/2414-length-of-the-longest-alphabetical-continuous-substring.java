class Solution {
    public int longestContinuousSubstring(String s) {
        int longestString = 1;
        int subLen = 1;
        for(int i = 0; i < s.length() - 1; i++){
            char char1 = s.charAt(i);
            char char2 = s.charAt(i+1);
            if(char1 == char2 - 1){
                subLen++;
                longestString = Math.max(longestString, subLen);
            } else {
                subLen = 1;
            }
        }
        return longestString;
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
        int len =s.length();
        for(int i=0; i<s.length(); i++){
            char s1 = s.charAt(len-1);
            String s2 = s.substring(0, len-1);

            s = s1+s2;
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
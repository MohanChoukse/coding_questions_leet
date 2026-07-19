class Solution {
    public boolean isPalindrome(String s) {
       s = s.toLowerCase();
       s = s.replaceAll("[^a-zA-Z0-9]", "");

       int i =0;
       int j = s.length()-1;

       while(i<j){
        char ch = s.charAt(i);
        if(ch == s.charAt(j) ){
            i++;
            j--;
        }else{
            return false;
        }
       }
      

return true;

        
    }
}
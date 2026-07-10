class Solution {
    public String removeOccurrences(String s, String part) {
        String result ="";
       while(s.contains(part)){
        s = s.replaceFirst(part, "");
       }

        //  for(int i=0; i<s.length(); i++){
        //   result =   result.replace(part, "");
        // }
        // return result = result.replace(part, "");
        return s;
    }
}
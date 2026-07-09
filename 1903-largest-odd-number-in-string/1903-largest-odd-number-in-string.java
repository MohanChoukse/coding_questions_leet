class Solution {
    public String largestOddNumber(String num) {
        String a = "";
        int i = num.length() - 1;

        while (i >= 0) {
            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            } else {
                i--;

            }
        }
        return a;
    }
}
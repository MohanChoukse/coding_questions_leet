class Solution {
    public String longestCommonPrefix(String[] strs) {

        String str = strs[0];

        for (int i = 1; i < strs.length; i++) {

            String ch = strs[i];
            int j = 0;

            while (j < str.length() && j < ch.length()) {

                if (str.charAt(j) != ch.charAt(j)) {
                    break;
                }

                j++;
            }

            str = str.substring(0, j);

            if (str.equals("")) {
                return "";
            }
        }

        return str;
    }
}
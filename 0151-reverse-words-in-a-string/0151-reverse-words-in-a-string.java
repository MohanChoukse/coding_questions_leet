class Solution {
    public String reverseWords(String s) {

        int i = s.length() - 1;
        int j = i;
        StringBuilder str = new StringBuilder();

        while (i >= 0) {

            while (true) {
                if (i < 0) {
                    break;
                }
                if (s.charAt(i) == ' ') {
                    i--;
                } else {
                    break;
                }
            }

            if (i < 0) {
                break;
            }
            j = i;

            while (true) {

                if (i < 0) {
                    break;
                }

                if (s.charAt(i) == ' ') {
                    break;
                } else {
                    i--;
                }
            }

            str.append(s.substring(i + 1, j + 1));
            str.append(' ');

        }

        if (str.length() > 0 && str.charAt(str.length() - 1) == ' ') {
            str.setLength(str.length() - 1);
        }

        return str.toString();
    }
}
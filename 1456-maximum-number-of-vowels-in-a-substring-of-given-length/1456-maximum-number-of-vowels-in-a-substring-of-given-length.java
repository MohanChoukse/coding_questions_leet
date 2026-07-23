class Solution {
    public int maxVowels(String s, int k) {
        int vol = 0;
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vol++;
            }
        }

        int max = vol;
        for (int i = k; i < s.length(); i++) {
            char chh = s.charAt(i - k);
            if (chh == 'a' || chh == 'e' || chh == 'i' || chh == 'o' || chh == 'u') {
                vol--;
            }
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vol++;

            }
            max = Math.max(max, vol);
            if (max == k) {
                return max;
            }
        }
        return max;
    }
}
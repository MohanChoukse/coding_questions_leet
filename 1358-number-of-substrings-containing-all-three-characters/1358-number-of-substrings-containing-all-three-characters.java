class Solution {
    public int numberOfSubstrings(String s) {
         HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int left = 0;

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() == 3) {
               char h = s.charAt(left);
                map.put(h, map.get(h) - 1);
                if (map.get(h) == 0) {
                    map.remove(h);
                }
                left++;
            }
            count += left;
        }
        return count;
    }
}
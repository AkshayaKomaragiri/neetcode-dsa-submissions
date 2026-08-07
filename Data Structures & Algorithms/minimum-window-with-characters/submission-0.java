class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int min = 200000;
        int have = 0;
        int length = Integer.MAX_VALUE;
        int[] range = {-1,-1};

        HashMap<Character, Integer> string_s = new HashMap<>();
        HashMap<Character, Integer> string_t = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (string_t.get(t.charAt(i)) == null)
                string_t.put(t.charAt(i), 1);
            else
                string_t.put(t.charAt(i), string_t.get(t.charAt(i)) + 1);
        }
        int need = string_t.size();

        char c = ' ';
        for (int right = 0; right < s.length(); right++) {
            c = s.charAt(right);
            if (string_s.get(c) == null)
                string_s.put(c, 1);
            else
                string_s.put(c, string_s.get(c) + 1);
            if (string_t.get(c) != null && (string_s.get(c).equals(string_t.get(c)))) {
                have++;
            }
           
            while (have == need) {
                if (right - left + 1 < length) {
                    range[0] = left;
                    range[1] = right;
                    length = right - left + 1;
                }
                string_s.put(s.charAt(left), string_s.get(s.charAt(left)) - 1);
                if (string_t.get(s.charAt(left)) != null
                    && string_s.get(s.charAt(left)) < string_t.get(s.charAt(left))) {
                    have--;
                }
                left++;
            }
        }
        if (range[0] == -1) return "";

        return s.substring(range[0], range[1]+1);
    }
}

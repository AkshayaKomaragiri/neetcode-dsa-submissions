class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
        int size = 0;
        int max = -1;
        int left = 0;
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;
        map.add(s.charAt(left));
        for (int right = 1; right < s.length(); right++) {
            if (!map.contains(s.charAt(right))) {
                map.add(s.charAt(right));

            } else {
                while (map.contains(s.charAt(right)) && left < right) {
                    map.remove(s.charAt(left));
                    left++;
                    
                }
                map.add(s.charAt(right));
                
            }
            size = right - left + 1;
            max = Math.max(size, max);
        }
        return max;
    }
}

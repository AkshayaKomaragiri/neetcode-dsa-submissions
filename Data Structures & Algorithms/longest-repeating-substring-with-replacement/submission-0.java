class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int left = 0;
        int current_max = -1;
        int length = -1;
       int[] map = new int[26];
        for (int right = 0; right < s.length(); right++) {
            map[s.charAt(right) -'A']++;
            current_max = Math.max(current_max, map[s.charAt(right) -'A']); 
            length = right - left + 1;
           if (length - current_max > k){
            map[s.charAt(left)-'A']--;
            left++;
           }
           max = Math.max(max, right - left + 1);
        }
        return max;
    }
}

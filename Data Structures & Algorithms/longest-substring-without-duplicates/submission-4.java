class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int k = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i)) == true) {
                set.remove(s.charAt(left));
                left++;
                
            }
            set.add(s.charAt(i));
            k = i - left + 1;
            System.out.println("left: "+left + ", i: " + i + ", length " + k);

            if (k> max){
                max = k;
            }
        }

        return max;
    }
}

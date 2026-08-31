class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int right = s1.length() - 1;
        char[] s1_char = s1.toCharArray();
        Arrays.sort(s1_char);
        String sorted = new String(s1_char);
        System.out.println(sorted);
        for (int left = 0; left < s2.length(); left++) {
            if (right < s2.length()) {
                String substring = s2.substring(left, right + 1);
                char[] arr = substring.toCharArray();
                Arrays.sort(arr);
                String current = new String(arr);
                System.out.println(current);
                if (current.equals(sorted)) {
                    return true;
                }
                right++;
            }
        }
        return false;
    }
}

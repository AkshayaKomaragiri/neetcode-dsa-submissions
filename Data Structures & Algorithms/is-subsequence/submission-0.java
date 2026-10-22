class Solution {
    public boolean isSubsequence(String s, String t) {
        int k = 0;
        int i = 0;
        while (k < s.length() && i < t.length()){
            System.out.println("checking " + s.charAt(k) + " and " + t.charAt(i));
            if (s.charAt(k) == t.charAt(i)){
                k++;
            }
            i++;
        }
        if (k == s.length()) return true;
        else return false;
        
    }
}
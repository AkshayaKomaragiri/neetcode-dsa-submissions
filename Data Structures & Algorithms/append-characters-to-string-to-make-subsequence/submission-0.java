class Solution {
    public int appendCharacters(String s, String t) {

        int k = 0;
        for (int i = 0; i < s.length(); i++){
            if (k == t.length()) return 0;
            if(t.charAt(k) == s.charAt(i)){
                k++;
            }
        }

        return t.length() - k;
        
    }
}
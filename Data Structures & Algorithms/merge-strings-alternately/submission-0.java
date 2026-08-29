class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int k = 0;
        StringBuilder str = new StringBuilder();
        while (i < word1.length() || k < word2.length()){
            if (i < word1.length()){
               str.append(word1.charAt(i));
                i++;
            }
            if(k<word2.length()){
                 str.append(word2.charAt(k));
                 k++;
            }
           
        }
        return str.toString();
        
    }
}
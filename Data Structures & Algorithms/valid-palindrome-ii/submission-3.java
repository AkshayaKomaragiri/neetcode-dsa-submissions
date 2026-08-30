class Solution {
    public boolean validPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;
        boolean toReturn = true;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return isPalindrome(left+1, right, s) || isPalindrome(left, right-1, s);
            }
            left++;
            right--;
        }
           
        return toReturn;
    }
    public boolean isPalindrome(int start, int end, String s){
        int right = end;
        int left = start;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
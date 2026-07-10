class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int k =0;
        int left = 0;
       for (int i = 0; i < s.length(); i++){
        while  (set.contains(s.charAt(i)) == true){
            k--;
            set.remove(s.charAt(left));
            left++;
            //set.clear();

        }
        if (set.contains(s.charAt(i)) == false){
            set.add(s.charAt(i));
            k++;
            if (k > max){
                max = k;
            }
        }
        System.out.println("at i: " + i +" : ");
         for (Character lang : set) {
            System.out.println(lang); // Order is not guaranteed
        }
        
       }
      
        return max; 
    }
   
}

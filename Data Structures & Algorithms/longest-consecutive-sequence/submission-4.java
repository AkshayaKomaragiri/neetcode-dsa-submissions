class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
       
       
        HashSet<Integer> set = new HashSet<>();
       for (int num : nums) set.add(num);
      
        for (int num : set){
            int current_max = 1;
           if (!set.contains(num-1)){
                  int current = num;
                while (set.contains(current+1)){
                    current++;
                    current_max++;
                }
           }
           max = Math.max(current_max, max); 
        }
        return max;
    }
}

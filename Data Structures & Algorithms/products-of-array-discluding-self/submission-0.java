class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] final_arr = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
         
        }
       
       int running = 1;
       for ( int k = nums.length-1; k >-1; k--){
        prefix[k] = prefix[k] * running;
        running = running * nums[k];
       }
       return prefix;
    }
    
}  

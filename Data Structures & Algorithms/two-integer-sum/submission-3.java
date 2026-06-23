class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] pair = new int[2];
        int temp = 0;
        
        int k = 0;
        HashMap<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i){
                
                pair[0] = Math.min(i, map.get(temp));
                pair[1] = Math.max(i, map.get(temp));
                return pair;
            }
            else{
                continue;
            }
        }
        return pair;
    }
}

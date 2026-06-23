class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        boolean toReturn = false;
        for (int i = 0; i < nums.length; i++){
            if (hash.contains(nums[i])){
                toReturn = true;
                break;
            }
            else{
                hash.add(nums[i]);
            }
        }
        return toReturn;
    }
}
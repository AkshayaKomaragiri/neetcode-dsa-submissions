class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] pair = new int[2];
        int temp1 = 0;
        int temp2 = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            temp1 = nums[i];
            k = i + 1;
            while (k < nums.length){
                if ((nums[i] + nums[k]) == target){
                    pair[0] = i;
                    pair[1] = k;
                    break;
                }
                k++;
            }
        }
        return pair;
    }
}

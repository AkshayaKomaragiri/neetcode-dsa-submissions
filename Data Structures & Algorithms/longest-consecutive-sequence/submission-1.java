class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1;
        int tempMax = 1;
        //HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        //2, 3, 4, 4, 5,10,11, 12, 12, 13 20 
        //[1, 2, 3, 3, 4, 1,2, 2, 3,  ]
        if (nums.length == 0)return 0;
        arr[0] = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] == nums[i]) {
                arr[i] = arr[i-1];
                continue;
            }
            if (nums[i-1] + 1 == nums[i]){
                arr[i] = arr[i-1] + 1;
            }
            else{
                arr[i] = 1;
            }
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}

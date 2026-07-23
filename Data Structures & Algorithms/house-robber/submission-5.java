class Solution {
    public int rob(int[] nums) {
      // 1 + 3
      //2 + 8 + 6 = 16, 
      // [2,7,9,3,1] 
      // 2 + 9 + 1 = 12, 7 + 3 = 10
      // arr[i] 
      // [0, 2, 7, 11, 10, 12] 

      // nums=[5,1,2,10,6,2,7,9,3,1]
      
      // 0   1  2  3  4
      // [0, 5, 1, 7, ]
      // 5 2 6 7 3 = 23
      // 1 10 2 9 1 = 23
      // 5 + 10 + 2 + 9 + 1 = 27
      if (nums.length == 1) return nums[0];
      int[] arr = new int[nums.length + 1];
      arr[1] = nums[0];
      arr[2] = Math.max(nums[0],nums[1]);
      int max = 0;
      for (int i = 3; i < arr.length; i++){
        // nums[i - 1] + arr[i - 2]
        // arr[i - 1] + nums[ i - 2]
       
        int toAdd = Math.max(nums[i - 1] + arr[i - 2], arr[i - 1] );
        arr[i] += toAdd;
      }
      if (arr[arr.length -1] >= arr[arr.length -2] ){
        return arr[arr.length -1];
      }
      else{
        return  arr[arr.length -2];
      }
  // [0, 1 , 1, ]
    }
}

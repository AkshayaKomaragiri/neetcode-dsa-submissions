class Solution {
    public int findMin(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int mid =  ((right - left) / 2);

        while (right > left) {
            
            if (nums[right] < nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            } 

            mid = left + (right - left) / 2;
        }

        return nums[mid];
    }
}

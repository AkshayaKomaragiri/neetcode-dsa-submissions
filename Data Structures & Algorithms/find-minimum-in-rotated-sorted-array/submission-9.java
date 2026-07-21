class Solution {
    public int findMin(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int mid = left + ((right - left) / 2);
        int min = 10000;

        while (right > left) {
            if (nums[mid] < min) {
                min = nums[mid];
            }
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

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        int mid = low + ((high - low)/2);
        int toReturn = -1;
        while (low <= high){
            if (nums[mid] == target){
                return mid;
            }
            if (nums[high] < nums[mid]){
                if (target >= nums[low] && target < nums[mid]){
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;  
                } else {
                    high = mid - 1; 
                }
            }
            mid = low + ((high - low)/2);
        }
        return toReturn;
    }
}

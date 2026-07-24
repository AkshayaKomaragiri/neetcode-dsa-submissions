class Solution {
    public int search(int[] nums, int target) {
        int left = 0; 
        int right = nums.length -1;
        int mid = (right - left)/2;
        // 5 - 0 /2 = 2 
        while (left <= right){
            //System.out.println(mid);
            if (nums[mid] == target) return mid;
            if (target > nums[mid]){
                left = mid + 1;
            }
            else if (target < nums[mid]){
                right = mid - 1;
            }
            mid = left + ((right - left)/2);
            
        }

        return -1;
        
    }
}

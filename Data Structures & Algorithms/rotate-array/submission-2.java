class Solution {
    public void rotate(int[] nums, int k) {
        int new_k = k % nums.length;
        reverse(nums, 0, nums.length);
        reverse(nums, 0, new_k);
        reverse(nums, new_k, nums.length);
    }
    public void reverse(int[] nums, int start, int end) {
        int mid = start + ((end - start) / 2);
        int i = start;
        int j = end - 1;
      //  System.out.println("start: " + start + ", end: " + end + ", mid: " + mid);

        while (i < nums.length && i != mid) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j = j - 1;
        }
      
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> sum = new ArrayList<>();
        int right = nums.length-1;
        int left = 0;
        int current = 0;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            left = i + 1;
            right = nums.length-1;
            // System.out.println("this is iteration: "+ i);
             if (i > 0 && nums[i-1] == nums[i]) continue;
            while(left < right){
                
                current = nums[i] + nums[right] + nums[left];
                //System.out.println("this is current: "+ current + " when i: " + nums[i] + ", left: " + nums[left] + ", right: " + nums[right]);
                if (current == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    //System.out.println("this sequence equals zero: " + temp);
                    list.add(temp);
                    
                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;
                left++;
                right--;
                }
                else if (current <= 0) left++;
                else if (current > 0)  right--; 
            }
        }
        
        return list;
    }
}

class Solution {

    
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
        getSubset(nums, 0, result);
        return result;
        
    }
   
    Deque<Integer> subset = new ArrayDeque<>();
    public void getSubset(int[] nums, int i , List<List<Integer>>  result){
        
        if (i >= nums.length ) {
            ArrayList<Integer> list = new ArrayList<>(subset);
            result.add(list);
            return;
        }

        subset.push(nums[i]);
        getSubset(nums, i+1, result);

        subset.pop();
        getSubset(nums, i+1, result);
    

    }
}

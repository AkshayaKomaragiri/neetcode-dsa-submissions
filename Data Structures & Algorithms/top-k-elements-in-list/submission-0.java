class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int temp = 0;
        int[] k_elements = new int[k];
        
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (hash.containsKey(nums[i])){
                temp = hash.get(nums[i]) + 1;
                hash.put(nums[i], temp);
            }
            else{
                hash.put(nums[i], 1);
            }     
        }
        for (int i = 0; i < k; i++){
            Map.Entry<Integer, Integer> maxEntry = Collections.max(hash.entrySet(), Map.Entry.comparingByValue());
            k_elements[j] = maxEntry.getKey();
            j++;
            hash.remove(maxEntry.getKey());

        }
        return k_elements;
    }
}

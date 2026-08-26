class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int majority = n / 2;
        int current_max = 0;
        int k = 0;
        System.out.println(majority);
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int current = map.get(nums[i]);
                map.put(nums[i], current + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if (entry.getValue() > current_max) {
                current_max = entry.getValue();
                k = entry.getKey();
            }
        }
        return k;
    }
}
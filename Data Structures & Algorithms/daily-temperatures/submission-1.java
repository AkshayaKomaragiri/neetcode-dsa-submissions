class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] arr = new int[temperatures.length];
        int j = 0;
        int temp = -1;
        for (int i = 0; i < temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                temp = stack.pop(); 
                arr[temp] = i - temp;
            }
            stack.push(i);  
        }
        return arr;
    }
}

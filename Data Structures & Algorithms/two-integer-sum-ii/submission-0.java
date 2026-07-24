class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int left = 0; 
        int sum = 0;
        int right = numbers.length -1;
       while (left < right){
        sum = numbers[left] + numbers[right];
        System.out.println("added " + numbers[left] + " and " + numbers[right]);
        if ( sum == target){
            System.out.println("this equals target");
            System.out.println(left + " and " + right);
            arr[0] = left + 1;
            arr[1] = right + 1;
            return arr;
        }
        if (sum < target){
            left++;
        }
        else if (sum > target){
            right--;
        }
         
       }
        return arr;
    }
}

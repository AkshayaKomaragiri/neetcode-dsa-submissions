class Solution {
    public int climbStairs(int n) {
        int count = 1; 
        int i = 0;
        if (n == 1) return 1;
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;
        for (int k =3; k < arr.length; k++){
            arr[k] = arr[k - 1] + arr[k - 2];
        }
        return arr[n];
        
    }
}

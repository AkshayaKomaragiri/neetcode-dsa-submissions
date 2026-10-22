class Solution {
    public int[] replaceElements(int[] arr) {
        int currentMax = arr[arr.length-1];
        
        int[] done = new int[arr.length];
        done[arr.length-1] = -1;
        for (int i = arr.length - 2; i >-1 ; i--){
            done[i] = currentMax;
            currentMax = Math.max(currentMax, arr[i]);
        }


        return done;
        
    }
}
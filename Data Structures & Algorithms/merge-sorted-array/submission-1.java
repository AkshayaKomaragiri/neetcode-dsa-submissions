class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int k = n-1;
        int j = (m+n) -1;
       // int j =0;
        // 1, 20,20,40,0,0  2 = 10,2
        // 1, 10
        System.out.println("j:" + j + ", i:" + i+", k:" + k);
        while (j > -1){
            if (i > -1 && k > -1&& nums2[k]<= nums1[i]){
                nums1[j] = nums1[i];
                i--; 
            }
            else if (k > -1 ){
                nums1[j] = nums2[k];
                k--;
            }

            j--;
        }
        
    }
}
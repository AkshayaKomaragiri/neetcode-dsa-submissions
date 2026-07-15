class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int max = 0;
        int area= 0;
        
        while (right > left){
            area = (right-left) * Math.min(heights[left], heights[right]);
            if (heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
          
            if (area > max){
                max = area;
            }
            
        }
        return max;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int max = 0;
        int area= 0;
        int length = 0;
        while (right > left){
            area = (right-left) * Math.min(heights[left], heights[right]);
            if (heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
            System.out.println("left: " + left + ", right: " + right);
            System.out.println("height[left] " + heights[left]);
            System.out.println("height[right] " + heights[right]);
            System.out.println("area: " + area);
            if (area > max){
                max = area;
            }
            
        }
        return max;
    }
}

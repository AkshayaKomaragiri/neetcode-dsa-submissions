class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low = 0;
        int high = matrix.length * matrix[0].length - 1;
        int row_length = matrix[0].length;
        int column_length = matrix.length;
        int row = 0;
        int column = 0;
        int mid = (high - low) /2;

        // 11/2 = 5.5 = 5 
        while (low <= high){
            // 5 % 4 = 1
            // 5 % 4 = 1 

            // 1 3 5 7
            // 10 11 16 20 
            // 23 30 34 60 
           
            row = mid / row_length;
            column = mid % row_length;
             System.out.println("mid: " + mid + ", value:" + matrix[row][column]);
            if (matrix[row][column] == target){
                return true;
            }
            if (matrix[row][column] > target){
                high = mid - 1;
            }
            else if (matrix[row][column] < target){
                low = mid + 1;
                
            }
            mid = low + ((high - low) /2);
        }
        return false;
        
    }
}

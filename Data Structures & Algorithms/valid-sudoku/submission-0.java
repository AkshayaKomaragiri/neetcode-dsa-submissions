

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                
                // Skip empty cells
                if (val == '.') {
                    continue;
                }
                
                // Form unique keys for Row, Column, and 3x3 Sub-box
                // Sub-box index is determined by (row / 3) and (col / 3)
                String rowKey = val + " in row " + i;
                String colKey = val + " in col " + j;
                String boxKey = val + " in box " + (i / 3) + "-" + (j / 3);
                
                // HashSet.add() returns false if the item was already present!
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
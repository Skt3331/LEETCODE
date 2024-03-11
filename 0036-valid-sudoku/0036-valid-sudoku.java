class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Use sets to check for repeated digits in rows, columns, and sub-boxes
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentChar = board[i][j];
                if (currentChar != '.') {
                    // Check for repeated digits in the same row, column, or sub-box
                    if (!seen.add(currentChar + " in row " + i) ||
                        !seen.add(currentChar + " in column " + j) ||
                        !seen.add(currentChar + " in sub-box " + i/3 + "-" + j/3)) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}

class Solution {
    public int totalNQueens(int n) {
        int[] columns = new int[n];
        return solveNQueensHelper(0, columns, n);
    }

    private int solveNQueensHelper(int row, int[] columns, int n) {
        if (row == n) {
            return 1;
        }
        
        int count = 0;
        for (int col = 0; col < n; col++) {
            if (isValid(columns, row, col)) {
                columns[row] = col;
                count += solveNQueensHelper(row + 1, columns, n);
            }
        }
        
        return count;
    }

    private boolean isValid(int[] columns, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (columns[i] == col || Math.abs(row - i) == Math.abs(columns[i] - col)) {
                return false;
            }
        }
        return true;
    }
}

class Solution {

public void setZeroes(int[][] matrix) {
    int m = matrix.length, n = matrix[0].length;
    boolean firstRowZero = false, firstColZero = false;

    // Check if first row has zero
    for (int j = 0; j < n; j++)
        if (matrix[0][j] == 0) firstRowZero = true;
    // Check if first column has zero
    for (int i = 0; i < m; i++)
        if (matrix[i][0] == 0) firstColZero = true;

    // Use first row and col to mark zeros
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    // Set zeros based on marks
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0)
                matrix[i][j] = 0;
        }
    }

    // Set first row
    if (firstRowZero) {
        for (int j = 0; j < n; j++) matrix[0][j] = 0;
    }
    // Set first col
    if (firstColZero) {
        for (int i = 0; i < m; i++) matrix[i][0] = 0;
    }
}


}
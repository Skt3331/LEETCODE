class Solution {
    public String convert(String s, int numRows) {
        // If numRows is 1, return the string itself
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        
        // Create an array of StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        
        // Iterating through the string and allocating characters to rows
        int row = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            // Change direction when the first or last row is reached
            if (row == 0 || row == numRows - 1) {
                goingDown = !goingDown;
            }
            // Update the row number
            row += goingDown ? 1 : -1;
        }
        
        // Concatenate StringBuilder from each row to form the result
        StringBuilder result = new StringBuilder();
        for (StringBuilder rowStr : rows) {
            result.append(rowStr);
        }
        
        return result.toString();
    }
}

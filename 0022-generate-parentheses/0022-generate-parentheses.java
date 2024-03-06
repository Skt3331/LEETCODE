import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper("", 0, 0, n, result);
        return result;
    }

    private void generateParenthesisHelper(String current, int open, int close, int n, List<String> result) {
        // Base case: if the length of the current string is 2*n
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // If the number of open parentheses is less than n, add an open parenthesis
        if (open < n) {
            generateParenthesisHelper(current + "(", open + 1, close, n, result);
        }
        // If the number of open parentheses is greater than the number of closing parentheses,
        // add a closing parenthesis
        if (close < open) {
            generateParenthesisHelper(current + ")", open, close + 1, n, result);
        }
    }
}

import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Dummy index to mark the start
        
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i); // Push index of '('
            } else { // ch == ')'
                stack.pop(); // Pop the matching '('
                if (stack.isEmpty()) {
                    stack.push(i); // Push current ')' index as new start
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
}

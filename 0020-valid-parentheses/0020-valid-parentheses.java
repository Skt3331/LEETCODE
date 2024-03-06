import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // Define the mapping of opening and closing brackets
        // We use a HashMap for O(1) lookup time
        HashMap<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            if (mapping.containsValue(c)) {
                // If the current character is an opening bracket, push it onto the stack
                stack.push(c);
            } else if (mapping.containsKey(c)) {
                // If the current character is a closing bracket
                if (stack.isEmpty() || stack.pop() != mapping.get(c)) {
                    // If the stack is empty or the top of the stack doesn't match the corresponding opening bracket
                    return false;
                }
            } else {
                // If the character is neither opening nor closing bracket
                return false;
            }
        }
        // If the stack is empty, all brackets are valid
        return stack.isEmpty();
    }
}

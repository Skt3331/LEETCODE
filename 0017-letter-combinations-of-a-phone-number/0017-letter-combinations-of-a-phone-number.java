import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // Create a mapping of digits to their corresponding letters
        String[] mappings = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
        
        backtrack(result, digits, mappings, new StringBuilder(), 0);
        return result;
    }
    
    private void backtrack(List<String> result, String digits, String[] mappings, StringBuilder combination, int index) {
        // If the combination has reached the desired length, add it to the result list
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }
        
        // Get the current digit
        char digit = digits.charAt(index);
        // Get the corresponding letters for the current digit
        String letters = mappings[digit - '0'];
        
        // Iterate through each letter and recursively generate combinations
        for (int i = 0; i < letters.length(); i++) {
            // Append the current letter to the combination
            combination.append(letters.charAt(i));
            // Recursively call backtrack for the next digit
            backtrack(result, digits, mappings, combination, index + 1);
            // Remove the last added letter to backtrack
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}

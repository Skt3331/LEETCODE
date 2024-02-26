import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                // If the character is found in the current substring,
                // move the start pointer to the right of the previous
                // occurrence of that character.
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Update the index of the current character.
            charIndexMap.put(currentChar, end);

            // Update the maximum length if a longer substring is found.
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take the first string as the reference
        String prefix = strs[0];
        
        // Iterate through the array of strings starting from the second string
        for (int i = 1; i < strs.length; i++) {
            // Keep comparing characters of the current string with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // If the prefix is not a prefix of the current string, shorten it by one character
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, there's no common prefix among the strings
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle.isEmpty()) {
            return 0;
        }
        
        int n = haystack.length();
        int m = needle.length();
        
        // Iterate through the haystack string
        for (int i = 0; i <= n - m; i++) {
            // Check if the substring of haystack matches needle
            if (haystack.substring(i, i + m).equals(needle)) {
                return i; // Return the index of the first occurrence
            }
        }
        
        return -1; // Return -1 if needle is not found in haystack
    }
}

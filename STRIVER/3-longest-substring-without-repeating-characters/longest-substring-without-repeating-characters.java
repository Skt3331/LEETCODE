class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;
        int n = s.length();
        
        while (right < n) {
            char c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}

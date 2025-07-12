class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        
        while (left < right) {
            // skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(ch[left])) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(ch[right])) {
                right--;
            }
            // compare characters case-insensitively
            if (Character.toLowerCase(ch[left]) != Character.toLowerCase(ch[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

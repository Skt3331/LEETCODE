class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int i = 0;
        int sign = 1;
        int result = 0;
        int n = s.length();
        
        // Ignore leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // Check for sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        // Process digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        return sign * result;
    }
}

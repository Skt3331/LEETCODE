class Solution {
    public int divide(int dividend, int divisor) {
        // Handle special cases
        if (divisor == 0) {
            return dividend >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (dividend == 0) {
            return 0;
        }

        // Handle overflow cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) != (divisor < 0);

        // Take the absolute value of dividend and divisor
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        // Initialize the quotient
        int quotient = 0;

        // Subtract divisor from dividend until dividend is smaller than divisor
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor, multiple = 1;
            // Find the greatest multiple of divisor that can be subtracted from dividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            absDividend -= tempDivisor;
            quotient += multiple;
        }

        // Apply the sign to the quotient
        return negative ? -quotient : quotient;
    }
}

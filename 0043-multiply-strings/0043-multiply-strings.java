class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];

        // Multiply each digit of num1 with each digit of num2
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int multiply = digit1 * digit2;

                int sum = multiply + result[i + j + 1]; // Add to the existing value at this position
                result[i + j] += sum / 10; // Carry
                result[i + j + 1] = sum % 10; // Update the current position
            }
        }

        // Convert the result array to a string
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if (!(sb.length() == 0 && digit == 0)) { // Skip leading zeros
                sb.append(digit);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}

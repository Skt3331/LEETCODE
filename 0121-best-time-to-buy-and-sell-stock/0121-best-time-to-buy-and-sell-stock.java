import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE; // Corrected from Integer.MAX.Value
        int maxProfit = 0; // Corrected from mixp to maxProfit

        for (int price : prices) {
            // Update min if the current price is lower
            if (min > price) {
                min = price;
            } 
            // Calculate profit if the current price is higher than min
            else if (price - min > maxProfit) { // Fixed syntax here
                maxProfit = price - min; // Corrected from maxp to maxProfit
            }
        }
        
        return maxProfit; // Return the maximum profit found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example stock prices
        int result = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + result); // Output: Maximum profit: 5
    }
}

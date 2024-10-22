class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; // No profit possible
        }

        int minPrice = Integer.MAX_VALUE; // Initialize min price to maximum
        int maxProfit = 0; // Initialize max profit to zero

        for (int price : prices) {
            // Update minPrice if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate profit if selling at current price
            else {
                int profit = price - minPrice;
                // Update maxProfit if the current profit is higher
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
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

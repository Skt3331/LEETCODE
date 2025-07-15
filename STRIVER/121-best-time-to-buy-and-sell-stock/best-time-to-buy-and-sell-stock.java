class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update the minimum price if we find a lower one
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                // Calculate profit and update maxProfit if it's higher
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}

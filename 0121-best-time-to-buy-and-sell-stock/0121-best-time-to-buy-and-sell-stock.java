class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0;i < prices.length;i++) {
            if (minPrice > prices[i])
                minPrice = prices[i];
            if (maxProfit < prices[i] - minPrice)
                maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }
}
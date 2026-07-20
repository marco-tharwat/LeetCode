public class Solution {
    public int MaxProfit(int[] prices)
    {
        int total = 0;
        int bought = -1;
        if (prices.Length == 1)
        {
            return 0;
        }
        for (int i = 0; i < prices.Length; i++)
        {
            if (i == 0)
            {
                if (int.MaxValue >= prices[i] && prices[i + 1] >= prices[i])
                {
                    bought = prices[i];
                }
            }
            else if (i == prices.Length - 1)
            {
                if (prices[i - 1] <= prices[i] && int.MinValue <= prices[i] && bought >= 0)
                {
                    total += prices[i] - bought;
                    bought = -1;
                }
            }
            else
            {
                if (prices[i - 1] >= prices[i] && prices[i + 1] >= prices[i] && bought < 0)
                {
                    bought = prices[i];
                }
                if (prices[i - 1] <= prices[i] && prices[i + 1] <= prices[i] && bought >= 0)
                {

                    total += prices[i] - bought;
                    bought = -1;

                }
            }
        }
        return total;
    }
}

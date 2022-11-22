package problemsolve.leetcode;

/**
 * Best Time to Buy and Sell Stock with Cooldown
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
public class Solution309 {
    public int maxProfit(int[] prices) {
        return (prices.length == 1) ?
                0 : (prices.length == 2) ?
                Math.max(0, prices[1] - prices[0]) : calMaxProfitWithDP(prices);
    }

    private int calMaxProfitWithDP(int[] prices) {
        int[] DP = new int[prices.length];
        DP[0] = 0;
        DP[1] = Math.max(0, prices[1] - prices[0]);

        for (int i = 2; i < DP.length; i++) {
            for (int j = 0; j < i; j++) {
                int profit = prices[i] - prices[j];
                int idx = j - 2;

                profit = (idx < 0) ? profit + 0 : profit + DP[idx];

                DP[i] = Math.max(DP[i], profit);
            }

            DP[i] = Math.max(DP[i], DP[i - 1]);
        }

        return DP[DP.length - 1];
    }
}

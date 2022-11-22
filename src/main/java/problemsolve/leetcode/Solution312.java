package problemsolve.leetcode;

/**
 * Burst Balloons
 * https://leetcode.com/problems/burst-balloons/
 */
public class Solution312 {
    public int maxCoins(int[] nums) {

        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[][] DP = new int[n][n];

        for (int len = 0; len < n; len++) {
            for (int s = 0; s < n - len; s++) {
                int e = s + len;
                for (int i = s; i <= e; i++) {
                    int coins = ((i == s) ? 0 : DP[s][i - 1]) + ((i == e) ? 0 : DP[i + 1][e]);
                    coins += ((s == 0) ? 1 : nums[s - 1]) * nums[i] * ((e == n - 1) ? 1 : nums[e + 1]);
                    DP[s][e] = Math.max(DP[s][e], coins);
                }
            }
        }


        return DP[0][n - 1];
    }
}

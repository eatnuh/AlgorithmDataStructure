package interview;

// 피보나치 수열 구하기
public class Fibonacci {

    private static final int F0 = 0;
    private static final int F1 = 1;

    // using recursion
    public int getFibonacciSeqUsingRecursion(int n) {
        if (n == 0) return F0;
        if (n == 1) return F1;
        return getFibonacciSeqUsingRecursion(n - 2) + getFibonacciSeqUsingRecursion(n - 1);
    }

    // using Dynamic Programming
    public int getFibonacciSeqUsingDynamicProgramming(int n) {
        if (n == 0) return F0;
        if (n == 1) return F1;

        int[] dp = new int[n + 1];
        dp[0] = F0;
        dp[1] = F1;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n];
    }

}

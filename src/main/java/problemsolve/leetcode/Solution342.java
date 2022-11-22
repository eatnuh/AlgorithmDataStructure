package problemsolve.leetcode;

/**
 * Power of Four
 * https://leetcode.com/problems/power-of-four/
 */
public class Solution342 {
    public boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        return (n % 4 == 0) ? isPowerOfFour(n / 4) : false;
    }
}

package problemsolve.leetcode;

import java.util.stream.IntStream;

/**
 * Counting Bits
 */
public class Solution338 {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];

        IntStream.range(0, n + 1).forEach(i -> result[i] = countBit(i));

        return result;
    }

    private int countBit(int n) {
        int count = 0;

        while (n != 0) {
            if (n % 2 == 1) count++;
            n = n / 2;
        }
        return count;
    }
}

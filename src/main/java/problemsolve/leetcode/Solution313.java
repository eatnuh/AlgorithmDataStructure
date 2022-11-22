package problemsolve.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Super Ugly Number
 * https://leetcode.com/problems/super-ugly-number/
 */
class Solution313 {
    public int nthSuperUglyNumber(int n, int[] primes) {

        int[] primeIdx = new int[primes.length];

        List<Integer> uglyNumberList = new ArrayList<>();
        uglyNumberList.add(1);

        while (uglyNumberList.size() != n) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < primes.length; i++) {
                min = Math.min(uglyNumberList.get(primeIdx[i]) * primes[i], min);
            }
            for (int i = 0; i < primes.length; i++) {
                if (min == (uglyNumberList.get(primeIdx[i]) * primes[i])) {
                    primeIdx[i]++;
                }
            }

            uglyNumberList.add(min);
        }

        return uglyNumberList.get(n - 1);
    }
}
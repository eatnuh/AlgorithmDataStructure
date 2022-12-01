package problemsolve.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> calculateSet = new HashSet<>();
        calculateSet.add(n);

        while(n != 1) {
            n = calcNext(n);
            if(calculateSet.contains(n)) return false;
            calculateSet.add(n);
        }

        return true;
    }

    private int calcNext(int n) {
        int next = 0;
        while(n != 0) {
            next += (n % 10) * (n % 10);
            n = n / 10;
        }
        return next;
    }
}

package problemsolve.leetcode;

public class Pow {
    public double myPow(double x, int n) {
        return doPow(x, n, 1);
    }

    private double doPow(double x, int n, double cur) {
        if(n == 0) return cur;
        return n > 0? doPow(x, n - 1, cur * x) : doPow(x, n + 1, cur / x);
    }
}

package problemsolve.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder origin = new StringBuilder().append(x);
        StringBuilder reverse = new StringBuilder().append(x).reverse();

        return origin.toString().equals(reverse.toString());
    }

}

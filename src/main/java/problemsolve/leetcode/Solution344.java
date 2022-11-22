package problemsolve.leetcode;

/**
 * Reverse String
 * https://leetcode.com/problems/reverse-string/
 */
public class Solution344 {
    public void reverseString(char[] s) {
        int startIdx = 0;
        int endIdx = s.length - 1;
        char temp;
        while (startIdx < endIdx) {
            temp = s[endIdx];
            s[endIdx] = s[startIdx];
            s[startIdx] = temp;
            startIdx++;
            endIdx--;
        }
    }
}

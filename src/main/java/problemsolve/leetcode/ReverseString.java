package problemsolve.leetcode;

public class ReverseString {

    public void reverseString(char[] s) {
        int len = s.length;
        char temp;

        for(int i = 0; i < len / 2; i++) {
            temp = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = temp;
        }
    }
}

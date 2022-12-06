package problemsolve.leetcode;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String longest = s.substring(0, 1);
        int sLen = s.length();
        boolean[][] isPalindrome = new boolean[sLen][sLen];

        for (int i = 0; i < sLen; i++) {
            isPalindrome[i][i] = true;
        }

        for(int len = 1; len < sLen; len++) {
            for(int start = 0; start + len < sLen; start++) {
                int end = start + len;
                isPalindrome[start][end] = (s.charAt(start) == s.charAt(end))
                         && ((start + 1 <= end - 1)? isPalindrome[start + 1][end - 1] : true);


                if(isPalindrome[start][end]) {
                    longest = s.substring(start, end + 1);
                }



            }
        }

        return longest;

    }

}

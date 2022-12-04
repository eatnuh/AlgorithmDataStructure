package problemsolve.leetcode;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int len = s.length();

        int[] bucket = new int[26];
        for(int i = 0; i < len; i++) {
            bucket[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < len; i++) {
            if(bucket[t.charAt(i) - 'a']-- == 0) return false;
        }

        return true;
    }
}

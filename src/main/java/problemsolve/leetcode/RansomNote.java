package problemsolve.leetcode;

// https://leetcode.com/problems/ransom-note/
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] bucket = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            bucket[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (--bucket[ransomNote.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }
}

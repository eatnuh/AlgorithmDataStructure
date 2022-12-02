package problemsolve.leetcode;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] bucket = new int[26];

        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (bucket[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;
    }
}

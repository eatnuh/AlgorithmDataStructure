package problemsolve.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if(charCountMap.getOrDefault(c, 0) == 0) {
                return c;
            }

            charCountMap.put(c, charCountMap.get(c) - 1);

        }

        return '0';
    }
}

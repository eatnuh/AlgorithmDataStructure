package problemsolve.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> characterMap = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(characterMap.containsKey(sChar)) {
                if(tChar != characterMap.get(sChar)) return false;
            } else {
                characterMap.put(sChar, tChar);
            }
        }

        return true;
    }
}

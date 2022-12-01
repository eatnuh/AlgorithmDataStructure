package problemsolve.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;

        Map<Character, Integer> characterToIndexMap = new HashMap<>();
        int left = 0;
        int right = 0;
        while(right < s.length()) {
            char c = s.charAt(right);

            if(characterToIndexMap.containsKey(c)) {
                int dupIndex = characterToIndexMap.get(c);
                for (int i = left; i <= dupIndex; i++) {
                    characterToIndexMap.remove(s.charAt(i));
                }
                left = dupIndex + 1;
            }

            characterToIndexMap.put(c, right);

            answer = Math.max(answer, right - left + 1);

            right++;
        }

        return answer;
    }
}

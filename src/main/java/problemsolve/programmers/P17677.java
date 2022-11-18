package problemsolve.programmers;

import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/17677
public class P17677 {
    public int solution(String str1, String str2) {
        Map<String, Integer> str1Map = new HashMap<>();
        Map<String, Integer> str2Map = new HashMap<>();

        addTwoAlpToMap(str1, str1Map);
        addTwoAlpToMap(str2, str2Map);

        System.out.println(str1Map);
        System.out.println(str2Map);


        int intersection = getIntersection(str1Map, str2Map);
        int union = getUnion(str1Map, str2Map, intersection);

        return intersection * 65536 / union;
    }

    private int getUnion(Map<String, Integer> str1Map, Map<String, Integer> str2Map, int intersection) {
        return str1Map.values().stream().reduce(0, (i1, i2) -> i1 + i2)
                + str1Map.values().stream().reduce(0, (i1, i2) -> i1 + i2)
                - intersection;
    }

    private int getIntersection(Map<String, Integer> str1Map, Map<String, Integer> str2Map) {
        int num = 0;

        for (String word : str1Map.keySet()) {
            num += Math.min(str2Map.getOrDefault(word, 0), str1Map.get(word));
        }

        return num;
    }

    public void addTwoAlpToMap(String str, Map<String, Integer> strMap) {
        for (int i = 0; i < str.length() - 1; i++) {
            String lowerTwoChar = str.substring(i, i + 2).toLowerCase();
            if (isValid(lowerTwoChar)) {
                strMap.put(lowerTwoChar, strMap.getOrDefault(lowerTwoChar, 0) + 1);
            }
        }
    }

    private boolean isValid(String lowerTwoChar) {
        return isLowerAlp(lowerTwoChar.charAt(0))
                && isLowerAlp(lowerTwoChar.charAt(1));
    }

    private boolean isLowerAlp(char c) {
        return 'a' <= c && c <= 'z';
    }
}

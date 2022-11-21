package problemsolve.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/17684
public class P17684 {
    public int[] solution(String msg) {

        List<Integer> indexList = new ArrayList<>();

        Map<String, Integer> dictionary = new HashMap<>();
        initDictionary(dictionary);

        int start = 0;
        int index = 27;
        while (start < msg.length()) {
            for (int end = msg.length() - 1; end >= start; end--) {
                String w = msg.substring(start, end + 1);
                if (dictionary.containsKey(w)) {
                    indexList.add(dictionary.get(w));
                    if (end != msg.length() - 1) {
                        dictionary.put(msg.substring(start, end + 2), index++);
                    }
                    start = end + 1;
                    break;
                }
            }

        }

        int[] answer = new int[indexList.size()];
        for (int i = 0; i < indexList.size(); i++) {
            answer[i] = indexList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String msg = "KAKAO";
        int[] solution = new P17684().solution(msg);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }


    private void initDictionary(Map<String, Integer> dictionary) {
        dictionary.put("A", 1);
        dictionary.put("B", 2);
        dictionary.put("C", 3);
        dictionary.put("D", 4);
        dictionary.put("E", 5);
        dictionary.put("F", 6);
        dictionary.put("G", 7);
        dictionary.put("H", 8);
        dictionary.put("I", 9);
        dictionary.put("J", 10);
        dictionary.put("K", 11);
        dictionary.put("L", 12);
        dictionary.put("M", 13);
        dictionary.put("N", 14);
        dictionary.put("O", 15);
        dictionary.put("P", 16);
        dictionary.put("Q", 17);
        dictionary.put("R", 18);
        dictionary.put("S", 19);
        dictionary.put("T", 20);
        dictionary.put("U", 21);
        dictionary.put("V", 22);
        dictionary.put("W", 23);
        dictionary.put("X", 24);
        dictionary.put("Y", 25);
        dictionary.put("Z", 26);
    }
}

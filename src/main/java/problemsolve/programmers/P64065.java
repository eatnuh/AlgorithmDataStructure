package problemsolve.programmers;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/64065
public class P64065 {
    public int[] solution(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();

        String[] numbers = s.replaceAll("\\{", "").replaceAll("}", "").split(",");

        for(String number : numbers) {
            int numberToInt = Integer.parseInt(number);
            map.put(numberToInt, map.getOrDefault(numberToInt, 0) + 1);
        }

        List<Integer> collect = map.keySet().stream().sorted((o1, o2) -> map.get(o2) - map.get(o1)).collect(Collectors.toList());

        int[] answer = new int[collect.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = collect.get(i);
        }
        return answer;
    }

}

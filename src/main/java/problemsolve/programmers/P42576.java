package problemsolve.programmers;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class P42576 {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> nameToCntMap = new HashMap<>();

        for(String name : participant) {
            nameToCntMap.put(name, nameToCntMap.getOrDefault(name, 0) + 1);
        }

        for(String name : completion) {
            nameToCntMap.put(name, nameToCntMap.get(name) - 1);
        }

        for(String name : nameToCntMap.keySet()) {
            if(nameToCntMap.get(name) == 1) return name;
        }

        return null;
    }
}

package problemsolve.programmers;

import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/131127
public class P131127 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantToNumber = new HashMap<>();
        Map<String, Integer> discToNumber = new HashMap<>();

        for(int i = 0; i < want.length; i++) {
            wantToNumber.put(want[i], number[i]);
        }

        for(int i = 0; i < 10; i++) {
            String discountProduct = discount[i];
            if(wantToNumber.containsKey(discountProduct)) {
                discToNumber.put(discountProduct, discToNumber.getOrDefault(discountProduct, 0) + 1);
            }
        }

        if(checkWant(wantToNumber, discToNumber)) answer++;

        for(int i = 1; i + 9 < discount.length; i++) {
            String oldProduct = discount[i - 1];
            String newProduct = discount[i + 9];

            if(discToNumber.containsKey(oldProduct))
                discToNumber.put(oldProduct, discToNumber.get(oldProduct) - 1);
            if(wantToNumber.containsKey(newProduct))
                discToNumber.put(newProduct, discToNumber.getOrDefault(newProduct, 0) + 1);
            if(checkWant(wantToNumber, discToNumber)) answer++;
        }

        return answer;
    }

    private boolean checkWant(Map<String, Integer> wantToNumber, Map<String, Integer> discToNumber) {
        for(String wantProduct : wantToNumber.keySet()) {
            if(!discToNumber.containsKey(wantProduct) || discToNumber.get(wantProduct) < wantToNumber.get(wantProduct))
                return false;
        }

        return true;
    }
}

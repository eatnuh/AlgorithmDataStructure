package problemsolve.programmers;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class P42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        Deque<Integer> deque = new LinkedList<>();

        for(int person : people) {
            deque.add(person);
        }

        while(deque.size() >= 2) {
            int light = deque.removeFirst();
            int heavy = deque.removeLast();

            if(light + heavy > limit)
                deque.addFirst(light);

            answer++;
        }

        return answer + (deque.size() == 1? 1 : 0);
    }
}

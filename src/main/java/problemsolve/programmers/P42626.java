package problemsolve.programmers;

import java.util.PriorityQueue;

// https://school.programmers.co.kr/learn/courses/30/lessons/42626
public class P42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int food : scoville) {
            pq.add(food);
        }

        while (true) {
            int food = pq.poll();

            if (food >= K) {
                return answer;
            } else {
                if (pq.isEmpty()) return -1;
                pq.add(food + (pq.poll() * 2));
                answer++;
            }

        }

    }
}

package problemsolve.programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class P42747 {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        int s = 1, e = citations.length;
        while(s <= e) {
            int m = (s + e) / 2;
            if(valid(m, citations)) {
                answer = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return answer;
    }

    private boolean valid(int h, int[] citations) {
        return citations[citations.length - h] >= h;
    }
}

package problemsolve.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12938
public class P12938 {
    public int[] solution(int n, int s) {
        if (n > s) return new int[]{-1};

        int[] answer = new int[n];

        int div = s / n;
        int mod = s % n;

        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = div + mod-- > 0? 1 : 0;
        }

        return answer;
    }
}

package problemsolve.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class P12924 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(isOdd(i) && isDivided(n, i)) answer++;
        }

        return answer;
    }

    public boolean isOdd(int num) {
        return !isDivided(num, 2);
    }

    public boolean isDivided(int op1, int op2) {
        return op1 % op2 == 0;
    }

}

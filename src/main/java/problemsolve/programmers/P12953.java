package problemsolve.programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class P12953 {
    public int solution(int[] arr) {
        int answer = 1;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            answer = (answer * arr[i]) / getGCD(answer, arr[i]);
        }

        return answer;
    }

    public int getGCD(int num1, int num2) {
        int big = Math.max(num1, num2);
        int small = Math.min(num1, num2);

        if(big % small == 0) return small;
        else return getGCD(small, big % small);
    }
}

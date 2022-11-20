package problemsolve.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/43165
public class P43165 {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        for(int i = 0; i < 1 << numbers.length; i++) {
            int sum = 0;
            for(int j = 0; j < numbers.length; j++) {
                sum += ((1<<j & i) != 0)? numbers[j] : -numbers[j];
            }
            if(sum == target) answer++;
        }


        return answer;
    }
}

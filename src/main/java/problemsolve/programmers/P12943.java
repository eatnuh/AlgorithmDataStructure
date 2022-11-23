package problemsolve.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class P12943 {
    public int solution(int num) {
        int answer = 0;
        long numToLong = num;

        while(answer <= 500) {
            if(numToLong == 1) {
                return answer;
            }

            numToLong = isEven(numToLong)? (numToLong / 2) : (3 * numToLong + 1);

            answer++;


        }

        return -1;
    }

    public boolean isEven(long num) {
        return num % 2 == 0;
    }
}

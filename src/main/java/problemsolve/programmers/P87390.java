package problemsolve.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/87390
public class P87390 {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right - left + 1);
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            long index = i + left;
            int row = (int) (index / n);
            int col = (int) (index % n);
            int value = Math.max(row + 1, col + 1);
            answer[i] = value;
        }


        return answer;
    }
}

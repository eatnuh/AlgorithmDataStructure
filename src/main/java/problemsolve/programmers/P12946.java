package problemsolve.programmers;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12946
public class P12946 {
    public int[][] solution(int n) {
        List<int[]> moves = new ArrayList<>();

        doHanoi(n, 1, 2, 3, moves);

        int[][] answer = new int[moves.size()][2];

        for(int i = 0; i < moves.size(); i++) {
            answer[i] = moves.get(i);
        }

        return answer;
    }

    public void doHanoi(int n, int from, int via, int to, List<int[]> moves) {
        if(n == 1) {
            moves.add(new int[]{from, to});
            return;
        }

        doHanoi(n - 1, from, to, via, moves);
        moves.add(new int[]{from, to});
        doHanoi(n - 1, via, from, to, moves);
    }

}

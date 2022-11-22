package problemsolve.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/43163
public class P43163 {

    private static int INF = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        boolean[] isVisited = new boolean[words.length];

        answer = dfs(begin, target, words, isVisited, 0);

        return answer == INF ? 0 : answer;
    }

    private int dfs(String cur, String end, String[] words, boolean[] isVisited, int step) {
        if (cur.equals(end)) return step;

        int min = INF;
        for (int i = 0; i < words.length; i++) {
            String next = words[i];
            if (!isVisited[i] && isValid(cur, next)) {
                isVisited[i] = true;
                min = Math.min(dfs(next, end, words, isVisited, step + 1), min);
                isVisited[i] = false;
            }
        }

        return min;
    }

    private boolean isValid(String cur, String next) {
        int diffCnt = 0;
        for (int i = 0; i < cur.length(); i++) {
            if (cur.charAt(i) != next.charAt(i)) diffCnt++;
        }
        return diffCnt == 1;
    }
}

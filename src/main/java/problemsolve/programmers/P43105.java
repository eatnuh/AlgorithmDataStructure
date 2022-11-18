package problemsolve.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/43105
public class P43105 {
    public int solution(int[][] triangle) {
        int answer = 0;

        int h = triangle.length;
        int w = triangle[h - 1].length;

        int[][] dp = new int[h][w];

        dp[0][0] = triangle[0][0];
        answer = triangle[0][0];

        for (int i = 1; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                int leftUp = (j > 0) ? dp[i - 1][j - 1] : 0;
                int rightUp = (i == j) ? 0 : dp[i - 1][j];

                dp[i][j] = Math.max(leftUp, rightUp) + triangle[i][j];
                answer = Math.max(answer, dp[i][j]);
            }
        }

        return answer;
    }
}

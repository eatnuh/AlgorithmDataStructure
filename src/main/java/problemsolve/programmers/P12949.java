package problemsolve.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12949
public class P12949 {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        int row = arr1.length;
        int col = arr2[0].length;

        int[][] answer = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                answer[i][j] = getMatrixMultiply(i, j, arr1, arr2);
            }
        }
        return answer;
    }

    private int getMatrixMultiply(int r, int c, int[][] arr1, int[][] arr2) {
        int result = 0;
        int repeatNum = arr1[0].length;

        for(int i = 0; i < repeatNum; i++) {
            result += arr1[r][i] * arr2[i][c];
        }

        return result;
    }

}

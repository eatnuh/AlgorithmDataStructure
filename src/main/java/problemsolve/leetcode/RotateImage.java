package problemsolve.leetcode;

public class RotateImage {
    public void rotate(int[][] matrix) {
        swapRowCol(matrix);
        swapHorizontal(matrix);
    }

    private void swapHorizontal(int[][] matrix) {
        int n = matrix.length;
        int temp;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < (n - 1) / 2; c++) {
                temp = matrix[r][c];
                matrix[r][c] = matrix[r][n - 1 - c];
                matrix[r][n - 1 - c] = temp;
            }
        }
    }

    private void swapRowCol(int[][] matrix) {
        int n = matrix.length;
        int temp;
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < n; c++) {
                if(r > c) {
                    temp = matrix[r][c];
                    matrix[r][c] = matrix[c][r];
                    matrix[c][r] = temp;
                }
            }
        }
    }

}

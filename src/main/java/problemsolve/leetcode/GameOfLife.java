package problemsolve.leetcode;

public class GameOfLife {

    private static int DEAD = 0;
    private static int ALIVE = 1;

    private static int DEAD_TO_ALIVE = 2;
    private static int DEAD_TO_DEAD = 3;
    private static int ALIVE_TO_ALIVE = 4;
    private static int ALIVE_TO_DEAD = 5;

    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (isAlive(board, i, j)) {
                    board[i][j] = board[i][j] == DEAD ? DEAD_TO_ALIVE : ALIVE_TO_ALIVE;
                } else {
                    board[i][j] = board[i][j] == DEAD ? DEAD_TO_DEAD : ALIVE_TO_DEAD;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = board[i][j] == DEAD_TO_ALIVE || board[i][j] == ALIVE_TO_ALIVE ? ALIVE : DEAD;
            }
        }

    }

    private boolean isAlive(int[][] board, int r, int c) {
        int aliveCnt = 0;
        aliveCnt += isInRange(r - 1, c - 1, board.length, board[0].length) && !isDeadStatus(board[r - 1][c - 1])? 1 : 0;
        aliveCnt += isInRange(r - 1, c, board.length, board[0].length) && !isDeadStatus(board[r - 1][c])? 1 : 0;
        aliveCnt += isInRange(r - 1, c + 1, board.length, board[0].length) && !isDeadStatus(board[r - 1][c + 1])? 1 : 0;
        aliveCnt += isInRange(r, c - 1, board.length, board[0].length) && !isDeadStatus(board[r][c - 1])? 1 : 0;
        aliveCnt += isInRange(r, c + 1, board.length, board[0].length) && !isDeadStatus(board[r][c + 1])? 1 : 0;
        aliveCnt += isInRange(r + 1, c - 1, board.length, board[0].length) && !isDeadStatus(board[r + 1][c - 1])? 1 : 0;
        aliveCnt += isInRange(r + 1, c, board.length, board[0].length) && !isDeadStatus(board[r + 1][c])? 1 : 0;
        aliveCnt += isInRange(r + 1, c + 1, board.length, board[0].length) && !isDeadStatus(board[r + 1][c + 1])? 1 : 0;

        if(board[r][c] == DEAD) return aliveCnt == 3;

        return aliveCnt == 2 || aliveCnt == 3;
    }

    private boolean isInRange(int r, int c, int h, int w) {
        return 0 <= r && r < h && 0 <= c && c < w;
    }

    private boolean isDeadStatus(int status) {
        return status == DEAD || status == DEAD_TO_DEAD || status == DEAD_TO_ALIVE;
    }

    public static void main(String[] args) {
        new GameOfLife().gameOfLife(new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}});
    }
}

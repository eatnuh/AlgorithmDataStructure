package problemsolve.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class P17679 {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        BlockBoard blockBoard = new BlockBoard(m, n, board);

        while (true) {
            int delBlockNum = blockBoard.doNext();
            answer += delBlockNum;
            if (delBlockNum == 0) break;

        }
        return answer;
    }

    static class BlockBoard {

        private static final char EMPTY = '.';

        private int rowSize;
        private int colSize;
        private char[][] board;

        public BlockBoard(int m, int n, String[] strBoard) {
            this.rowSize = m;
            this.colSize = n;
            this.board = new char[rowSize][colSize];

            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    board[i][j] = strBoard[i].charAt(j);
                }
            }
        }

        public int doNext() {
            int delBlockNum = deleteBlock();
            if (delBlockNum != 0) {
                fallBlock();
            }

            return delBlockNum;
        }

        private void fallBlock() {
            for (int i = 0; i < colSize; i++) {
                Queue<Character> blockQueue = new LinkedList<>();
                for (int j = rowSize - 1; j >= 0; j--) {
                    if (board[j][i] != EMPTY) blockQueue.add(board[j][i]);
                }

                for (int j = rowSize - 1; j >= 0; j--) {
                    board[j][i] = blockQueue.isEmpty() ? EMPTY : blockQueue.poll();
                }
            }
        }

        private int deleteBlock() {
            int delBlockNum = 0;
            boolean[][] isDelete = new boolean[rowSize][colSize];

            for (int i = 0; i < rowSize - 1; i++) {
                for (int j = 0; j < colSize - 1; j++) {
                    char upLeft = board[i][j];
                    char upRight = board[i][j + 1];
                    char downLeft = board[i + 1][j];
                    char downRight = board[i + 1][j + 1];

                    if (upLeft == upRight && upRight == downLeft && downLeft == downRight && upLeft != EMPTY) {
                        isDelete[i][j] = true;
                        isDelete[i][j + 1] = true;
                        isDelete[i + 1][j] = true;
                        isDelete[i + 1][j + 1] = true;
                    }
                }
            }

            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    if (isDelete[i][j]) {
                        delBlockNum++;
                        board[i][j] = EMPTY;
                    }
                }
            }

            return delBlockNum;
        }

    }
}

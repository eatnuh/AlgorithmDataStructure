package problemsolve.programmers;

import java.util.LinkedList;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/1844
public class P1844 {

    private static int ROAD = 1;
    private static int WALL = 0;
    private static int[][] DIR = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int solution(int[][] maps) {
        int mapRow = maps.length;
        int mapCol = maps[0].length;

        boolean[][] isVisited = new boolean[maps.length][maps[0].length];

        Queue<Node> q = new LinkedList<>();

        q.add(new Node(0, 0, 1));
        isVisited[0][0] = true;

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.r == mapRow - 1 && temp.c == mapCol - 1) {
                return temp.distance;
            }

            for (int i = 0; i < DIR.length; i++) {
                int nextR = temp.r + DIR[i][0];
                int nextC = temp.c + DIR[i][1];
                int nextDistance = temp.distance + 1;
                if (isInMap(nextR, nextC, mapRow, mapCol) && maps[nextR][nextC] == ROAD && !isVisited[nextR][nextC]) {
                    q.add(new Node(nextR, nextC, nextDistance));
                    isVisited[nextR][nextC] = true;
                }

            }
        }

        return -1;
    }

    private boolean isInMap(int row, int col, int mapRow, int mapCol) {
        return 0 <= row && row < mapRow && 0 <= col && col < mapCol;
    }

    static class Node {
        int r;
        int c;
        int distance;

        public Node(int r, int c, int distance) {
            this.r = r;
            this.c = c;
            this.distance = distance;
        }
    }
}

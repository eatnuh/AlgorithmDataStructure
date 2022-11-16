package algorithm.graph.shortestpath;

import static java.lang.Math.min;

public class FloydWarshallAlgorithm {

    private static int INF = 999;

    public void apply(int[][] adjacencyMatrix) {
        int vertexCnt = adjacencyMatrix.length;
        for (int mid = 0; mid < vertexCnt; mid++) {
            for (int start = 0; start < vertexCnt; start++) {
                for (int end = 0; end < vertexCnt; end++) {
                    adjacencyMatrix[start][end] =
                            min(adjacencyMatrix[start][end],
                                    adjacencyMatrix[start][mid] + adjacencyMatrix[mid][end]);
                }
            }
        }
    }

}

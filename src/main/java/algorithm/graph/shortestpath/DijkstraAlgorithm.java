package algorithm.graph.shortestpath;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    private static final int INF = Integer.MAX_VALUE;

    public int[] findDistance(int[][] adjacencyMatrix, int src) {
        int vertexCnt = adjacencyMatrix.length;

        int[] distance = new int[vertexCnt];
        boolean[] visited = new boolean[vertexCnt];

        for(int i = 0; i < vertexCnt; i++) {
            distance[i] = INF;
            visited[i] = false;
        }

        distance[src] = 0;
        visited[src] = true;

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));

        pq.add(new Node(src, 0));

        while(!pq.isEmpty()) {
            Node curNode = pq.poll();

            if(distance[curNode.vertex] < curNode.cost) {
                continue;
            }

            for(int i = 0; i < vertexCnt; i++) {
                Node nextNode = new Node(i, adjacencyMatrix[curNode.vertex][i]);
            }
        }



        return distance;
    }

    private static class Node {
        int vertex;
        int cost;

        public Node(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }
    }
}

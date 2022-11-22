package problemsolve.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Minimum Height Trees
 * https://leetcode.com/problems/minimum-height-trees/
 */
public class Solution310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n < 3) {
            return IntStream.range(0, n).boxed().collect(Collectors.toList());
        }

        List<Set<Integer>> adjList = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> adjList.add(new HashSet<>()));

        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        List<Integer> leaves = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (adjList.get(i).size() == 1)
                leaves.add(i);
        }

        int remain = n;

        while (remain > 2) {
            List<Integer> nextLeaves = new ArrayList<>();

            for (Integer leaf : leaves) {
                Integer neighbor = adjList.get(leaf).iterator().next();

                adjList.get(neighbor).remove(leaf);

                if (adjList.get(neighbor).size() == 1) nextLeaves.add(neighbor);
            }
            remain -= leaves.size();
            leaves = nextLeaves;
        }

        return leaves;

    }

}

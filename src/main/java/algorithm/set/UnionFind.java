package algorithm.set;

public class UnionFind {

    private final int[] group;

    public UnionFind(int n) {
        group = new int[n];
        // initialize group
        for (int i = 0; i < n; i++) {
            group[i] = i;
        }
    }

    public int find(int index) {
        if (group[index] == index) return index;
        return (group[index] = find(group[index]));
    }

    public void union(int index1, int index2) {
        int root1 = find(index1);
        int root2 = find(index2);

        group[root1] = root2;
    }


}

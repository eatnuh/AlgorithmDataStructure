package problemsolve.leetcode;

import java.util.List;

/**
 * Maximum Depth of N-ary Tree
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 */
public class Solution559 {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children.size() == 0) return 1;
        return 1 + root.children.stream().map(this::maxDepth).mapToInt(x -> x).max().getAsInt();
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}

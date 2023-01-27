package problemsolve.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();

        inorder(root, answer);

        return answer;
    }

    private void inorder(TreeNode root, List<Integer> answer) {
        if(root == null) return;

        inorder(root.left, answer);
        answer.add(root.val);
        inorder(root.right, answer);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}

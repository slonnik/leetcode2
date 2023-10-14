package org.example0.problem404;

public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        return sumLeft(root.left) + sumRight(root.right);
    }

    private int sumLeft(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return root.val;
        }
        return sumLeft(root.left) + sumRight(root.right);
    }

    private int sumRight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return sumLeft(root.left) + sumRight(root.right);
    }
}

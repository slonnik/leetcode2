package org.example1.problem563;


class Solution {

    int totalTilt = 0;

    static public class TreeNode {
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

    public int findTilt(TreeNode root) {
        innerNode(root);
        return totalTilt;
    }

    private int innerNode(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int left = innerNode(node.left);
        int right = innerNode(node.right);
        totalTilt += Math.abs(left - right);
        return node.val + left + right;
    }
}


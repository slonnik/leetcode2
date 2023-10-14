package org.example3.problem606;

public class Solution {
    public static class TreeNode {
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


    public String tree2str(TreeNode root) {
        var builder = new StringBuilder();
        internal(builder, root);
        return builder.toString();
    }
    private void internal(StringBuilder builder, TreeNode node) {
        if(node == null) {
            return;
        }
        builder.append(node.val);
        if(node.left ==null && node.right == null) {
            return;
        }

        builder.append('(');
        internal(builder, node.left);
        builder.append(')');
        if(node.right !=null) {
            builder.append('(');
            internal(builder, node.right);
            builder.append(')');
        }
    }
}

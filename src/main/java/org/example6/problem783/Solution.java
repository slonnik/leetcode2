package org.example6.problem783;


import java.util.Set;
import java.util.TreeSet;

public class Solution {

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

    public int minDiffInBST(TreeNode root) {
        var data = new TreeSet<Integer>();
        internal(root, data);
        var min = Integer.MAX_VALUE;
        var iterator = data.iterator();
        var start = iterator.next();
        while(iterator.hasNext()) {
            var current = iterator.next();
            min = Math.min(min, Math.abs(current-start));
            start = current;
        }
        return min;
    }

    private void internal(TreeNode root, Set<Integer> data) {
        if (root == null) {
            return;
        }
        data.add(root.val);
        internal(root.right, data);
        internal(root.left, data);
    }
}

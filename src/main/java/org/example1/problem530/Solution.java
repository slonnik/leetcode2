package org.example1.problem530;


import java.util.Set;
import java.util.TreeSet;

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


    public int getMinimumDifference(TreeNode root) {
        TreeSet<Integer> data = new TreeSet<Integer>();
        recursive(root, data);
        int minDiff = Integer.MAX_VALUE;
        int prev = -1;
        var dataIterator = data.iterator();
        while(dataIterator.hasNext()) {
            var value = dataIterator.next();
            if(prev != -1) {
                var curDiff = value - prev;
                if(curDiff < minDiff) {
                    minDiff = curDiff;
                }
            }
            prev = value;
        }
        return minDiff;
    }

    private void recursive(TreeNode node, Set<Integer> data) {
        if(node == null) {
            return;
        }
        data.add(node.val);
        recursive(node.left, data);
        recursive(node.right, data);
    }

}

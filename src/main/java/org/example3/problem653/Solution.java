package org.example3.problem653;

import java.util.HashSet;
import java.util.Set;

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
    public boolean findTarget(TreeNode root, int k) {
        var data = new HashSet<Integer>();
        internal(root, k, data);
        var iterator = data.iterator();
        while(iterator.hasNext()) {
            var value = iterator.next();
            iterator.remove();
            if(data.contains(k-value)) {
                return true;
            }

        }
        return false;
    }

    private void internal(TreeNode node, int k, Set<Integer> data) {
        if(node == null) {
            return;
        }
        data.add(node.val);
        internal(node.left, k, data);
        internal(node.right, k, data);
    }
}

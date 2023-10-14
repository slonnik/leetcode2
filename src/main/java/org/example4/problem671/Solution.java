package org.example4.problem671;

import java.util.HashSet;
import java.util.LinkedList;
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

    public int findSecondMinimumValue(TreeNode root) {

        var data = new TreeSet<Integer>();
        internal(root, data);
        if(data.size() < 2) {
            return -1;
        }
        var iterator = data.iterator();
        iterator.next();
        return iterator.next();
    }

    void internal(TreeNode node, Set data) {
        if (node == null) {
            return;
        }
        data.add(node.val);
        internal(node.left, data);
        internal(node.right, data);
    }
}

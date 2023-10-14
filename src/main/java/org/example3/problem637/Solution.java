package org.example3.problem637;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

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

    Deque<TreeNode> deque = new LinkedList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        var result = new LinkedList<Double>();
        deque.offer(root);

        while(!deque.isEmpty()) {
            int size = deque.size();
            long sum =0;
            for(int i =0; i< size; ++i) {
                var node = deque.poll();
                sum += node.val;
                if(node.left != null) {
                    deque.offer(node.left);
                }
                if(node.right != null) {
                    deque.offer(node.right);
                }
            }
            result.add((double)sum/size);
        }

        return result;
    }


}

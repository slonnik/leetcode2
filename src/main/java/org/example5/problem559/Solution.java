package org.example5.problem559;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public int maxDepth(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            sum++;
            for(int i=0; i < size; ++i) {
                var node = queue.poll();
                if (node.children != null) {
                    for (var child : node.children) {
                        queue.offer(child);
                    }
                }
            }
        }

        return sum;
    }

}

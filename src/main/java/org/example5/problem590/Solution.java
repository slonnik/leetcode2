package org.example5.problem590;

import java.util.LinkedList;
import java.util.List;

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

    public List<Integer> postorder(Node root) {
        var data = new LinkedList<Integer>();
        internal(root, data);
        return data;
    }

    private void internal(Node node, List<Integer> data) {
        if(node == null) {
            return;
        }
        if(node.children != null) {
            for(var child : node.children) {
                internal(child, data);
            }
        }
        data.add(node.val);
    }
}

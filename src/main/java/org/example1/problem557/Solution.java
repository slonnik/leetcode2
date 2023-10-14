package org.example1.problem557;

import java.util.LinkedList;

public class Solution {

    public String reverseWords(String s) {
        var positions = new LinkedList<Integer>();
        positions.add(-1);
        for (int i = 0; i < s.length(); ++i) {
            char symbol = s.charAt(i);
            if (symbol == ' ') {
                positions.add(i);
            }
        }
        positions.add(s.length());
        var builder = new StringBuilder();
        for (int j = 1; j < positions.size(); ++j) {
            int startPos = positions.get(j-1);
            int endPos = positions.get(j);
            for(int k = endPos -1; k > startPos; k--) {
                builder.append(s.charAt(k));
            }
            builder.append(' ');
        }
        return builder.deleteCharAt(s.length()).toString();
    }
}

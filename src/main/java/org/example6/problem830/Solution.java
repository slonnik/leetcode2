package org.example6.problem830;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> largeGroupPositions(String s) {
        var result = new LinkedList<List<Integer>>();
        if (s.length() == 0) {
            return List.of();
        }
        var startPos = 0;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) != s.charAt(startPos)) {
                if (i - startPos >= 3) {
                    result.add(List.of(startPos, i - 1));
                }
                startPos = i;
            }
        }

        if (s.length() - startPos >= 3) {
            result.add(List.of(startPos, s.length() - 1));
        }
        return result;
    }
}

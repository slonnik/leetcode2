package org.example1.problem506;

import java.util.TreeMap;

public class Solution {

    public String[] findRelativeRanks(int[] score) {
        var data = new TreeMap<Integer, Integer>();
        for(int i=0; i< score.length; ++i) {
            data.put(score[i], i);
        }
        var result = new String[score.length];
        int count = 0;

        for(var key : data.descendingKeySet()) {
            var pos = data.get(key);
            result[pos] = switch (count) {
                case 0 -> "Gold Medal";
                case 1 -> "Silver Medal";
                case 2 -> "Bronze Medal";
                default -> "" + (count + 1);
            };
            count++;
        }
        return result;
    }

}

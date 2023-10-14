package org.example1.problem575;

import java.util.HashSet;

public class Solution {

    public int distributeCandies(int[] candyType) {
        var data =  new HashSet<Integer>();
        for(int i=0; i < candyType.length; ++i) {
            data.add(candyType[i]);
        }
        int capacity = candyType.length / 2;
        return Math.min(data.size(), capacity);
    }
}

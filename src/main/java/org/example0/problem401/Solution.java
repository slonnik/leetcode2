package org.example0.problem401;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        int[] data = new int[60];
        for (int i = 0; i < data.length; ++i) {
            data[i] = count(i);
        }
        var result = new LinkedList<String>();
        for(int hour = 0; hour < 12; hour++) {
            for(int minute =0; minute < 60; minute++) {
                int hCount = data[hour];
                int mCount = data[minute];
                if(hCount + mCount == turnedOn) {
                    result.add("%d:%02d".formatted(hour, minute));
                }
            }
        }
        return result;
    }

    static int count(int number) {
        if(number == 0) {
            return 0;
        }
        if (number < 2) {
            return 1;
        }
        return (number % 2) + count(number >> 1);
    }
}

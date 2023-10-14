package org.example0.problem492;

import static java.lang.Math.abs;

public class Solution {

    public int[] constructRectangle(int area) {
        int[] result = new int[] {Integer.MAX_VALUE, 0};
        for (int i = 1; i <= area; ++i) {
            if(area % i == 0) {
                var value = area / i;
                var currentDiff = abs(value - i);
                if( currentDiff < result[0] - result[1]) {
                    if(value > i) {
                        result[0] = value;
                        result[1] = i;
                    } else {
                        result[1] = value;
                        result[0] = i;
                    }
                }
            }
        }
        return result;
    }
}

package org.example5.problem762;

import java.util.Set;

public class Solution {

    public int countPrimeSetBits(int left, int right) {
        var primeNumber = Set.of(2, 3, 5, 7, 11, 13, 17, 19);
        var sum = 0;
        for (int i = left; i <= right; ++i) {
            var data = Integer.bitCount(i);
            if(primeNumber.contains(data)) {
                sum++;
            }
        }
        return sum;
    }

}

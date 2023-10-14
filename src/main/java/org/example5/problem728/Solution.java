package org.example5.problem728;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        var result = new LinkedList<Integer>();
        for(int i=left; i<=right; ++i) {
            internal(result, i, i);
        }
        return result;
    }

    void internal(List<Integer> data, int originalNumber, int number) {
        while(number != 0) {
            var reminder = number % 10;
            if(reminder == 0) {
                return;
            }
            if(originalNumber % reminder !=0) {
                return;
            }
            number /= 10;
        }
        data.add(originalNumber);
    }
}

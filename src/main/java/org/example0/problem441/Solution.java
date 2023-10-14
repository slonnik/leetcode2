package org.example0.problem441;

public class Solution {

    public int arrangeCoins(int n) {
        if (n == 1) {
            return 1;
        }
        return (int)_internal(n, n);

    }

    long _internal(long step, long n) {
        long median = step / 2;
        long value = (1 + median) * median / 2;
        if(value == n) {
            return median;
        }
        if(value > n) {
            return _internal(median /2, n);
        }
        long counter = median;
        while(true) {
            value = (1 + counter) * counter / 2;
            if(value > n) {
                return counter - 1;
            }
            counter++;
        }
    }
}

package org.example0.problem476;

public class Solution {

    public int findComplement(int num) {
        long value = 1;
        int data = num;
        while(data > 0) {
            data >>= 1;
            value *= 2;
        }

        return (int)(num ^ --value);
    }
}

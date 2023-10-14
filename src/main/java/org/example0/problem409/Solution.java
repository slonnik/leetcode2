package org.example0.problem409;

public class Solution {

    public int longestPalindrome(String s) {
        final int CAPACITY = 58;
        int[] data = new int[CAPACITY];
        for(int i = 0; i < s.length(); ++i) {
            var position  = s.charAt(i) - 'A';
            data[position] = data[position] + 1;
        }

        var length = 0;
        var add = 0;
        for(int i = 0; i < CAPACITY; ++i) {
            length += data[i] - data[i] % 2;
            if(data[i] %2 == 1) {
                add = 1;
            }
        }

        return length + add;
    }
}

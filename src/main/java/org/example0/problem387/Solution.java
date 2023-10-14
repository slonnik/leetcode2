package org.example0.problem387;

public class Solution {

    public int firstUniqChar(String s) {
        int[] cache = new int[26];
        char[] data = s.toCharArray();
        for(char symbol : data) {
            int pos = symbol - 'a';
            cache[pos] = cache[pos] + 1;
        }

        for(int i=0; i < data.length; ++i) {
            int pos = data[i] - 'a';
            if(cache[pos] == 1) {
                return i;
            }
        }
        return -1;
    }
}

package org.example5.problem748;

import java.util.Arrays;

public class Solution {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        var data = new int['z' - 'a' + 1];
        for(int i=0; i< licensePlate.length(); ++i) {
            var symbol = licensePlate.charAt(i);
            if(symbol >= 'a' && symbol <= 'z') {
                data[symbol-'a'] += 1;
            } else if(symbol >= 'A' && symbol <= 'Z') {
                data[symbol-'A'] += 1;
            }
        }
        String result = null;
        main_loop: for(var word : words) {
            var input = Arrays.copyOf(data, data.length);
            for(int i=0; i< word.length(); ++i) {
                var symbol = word.charAt(i);
                var pos  = symbol-'a';
                if(input[pos] != 0) {
                    input[pos] -=1;
                }
            }
            for(var item : input) {
                if(item != 0) {
                    continue main_loop;
                }
            }
            if(result == null) {
                result = word;
            } else if(word.length() < result.length()){
                result = word;
            }
        }
        return result;
    }
}

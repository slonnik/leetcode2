package org.example1.problem520;

public class Solution {

    public boolean detectCapitalUse(String word) {
        if (word.length() == 0) {
            return false;
        }
        if (word.length() == 1) {
            return true;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =1; i < word.length(); ++i) {
            var symbol = word.charAt(i);
            if(symbol > max) {
                max = symbol;
            }
            if(symbol < min) {
                min = symbol;
            }
        }

        if(min <= 'Z' && max >= 'a')
        {
            return false;
        }
        if(min >= 'a') {
            return true;
        }
        return max <= 'Z' && word.charAt(0) <= 'Z';
    }
}

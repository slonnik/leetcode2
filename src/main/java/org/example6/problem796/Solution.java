package org.example6.problem796;

public class Solution {

    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        int length = s.length();
        int start = 0;
        while(start < length) {
            boolean matched = true;
            for(int i=start, k=0; i < length + start; ++i, ++k) {
                var position = i;
                if(position >= length) {
                    position -= length;
                }
                var symbol = s.charAt(position);
                if(symbol != goal.charAt(k)) {
                    matched = false;
                    break;
                }
            }
            if(matched) {
                return true;
            }
            start++;
        }
        return false;
    }
}

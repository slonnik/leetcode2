package org.example0.problem459;

public class Solution {

    public boolean repeatedSubstringPattern(String s) {
        var total = 0L;
        for(int i=0; i < s.length(); ++i) {
            total += s.charAt(i);
        }

        var sum = 0L;
        var builder = new StringBuilder();
        for(int i=0; i< s.length(); ++i) {
            var symbol = s.charAt(i);
            sum += symbol;
            builder.append(symbol);
            if(total % sum == 0) {
                if(check(builder.toString(), s)) {
                    return true;
                }
            }

        }

        return false;
    }

    private boolean check(String pattern, String data) {
        if(pattern.length() >= data.length() || data.length() % pattern.length() != 0) {
            return false;
        }
        int curPos = pattern.length();
        while(curPos < data.length()) {
            for(int i=0; i<pattern.length(); ++i) {
                if(pattern.charAt(i) != data.charAt(curPos + i)) {
                    return false;
                }
            }
            curPos += pattern.length();
        }
        return true;
    }
}

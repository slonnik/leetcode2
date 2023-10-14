package org.example0.problem482;

public class Solution {

    public String licenseKeyFormatting(String s, int k) {
        int curPos = s.length() -1;
        int secondPointer = 0;
        var builder = new StringBuilder();

        while(curPos >=0 ) {
            var symbol = s.charAt(curPos);
            symbol = (symbol >96 && symbol < 123) ? (char)(symbol -32) : symbol;
            if(symbol != '-') {
                secondPointer++;
                builder.append(symbol);
                if(secondPointer == k) {
                    builder.append('-');
                    secondPointer=0;
                }
            }
            curPos--;
        }
        builder = builder.reverse();
        if(!builder.isEmpty() && builder.charAt(0) == '-') {
            builder.deleteCharAt(0);
        }
        return builder.toString();
    }
}

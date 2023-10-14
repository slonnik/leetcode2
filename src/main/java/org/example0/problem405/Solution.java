package org.example0.problem405;

import static java.lang.Math.abs;

public class Solution {

    char[] digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String toHex(int num) {

        return num >=0 ? positive(num) : negative(num);
    }

    private String positive(int num) {
        var builder = new StringBuilder();
        do {
            builder.insert(0, digits[num % 16]);
            num  >>>= 4;
        } while (num > 0);
        return builder.toString();
    }

    public String negative(int num) {
        var test = Long.MAX_VALUE ^ ( -num - 1);
        var builder = new StringBuilder();
        for(int i=0; i < 8; ++i) {
            builder.insert(0, digits[(int)(test % 16)]);
            test = test >>> 4;
        }
        return builder.toString();
    }
}

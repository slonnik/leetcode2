package org.example4.problem696;

public class Solution {
    public int countBinarySubstrings(String s) {
        var count = 0;
        for (int i = 1; i < s.length(); ++i) {
            var startSymbol = s.charAt(i - 1);
            var endSymbol = s.charAt(i);
            if (startSymbol != endSymbol) {
                var start = i - 1;
                var end = i;
                System.out.println(s.substring(start, end + 1));
                count++;
                while (true) {
                    end++;
                    start--;
                    if (start < 0 || end >= s.length()) {
                        break;
                    }
                    if (s.charAt(start) == startSymbol && s.charAt(end) == endSymbol) {
                        System.out.println(s.substring(start, end + 1));
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }
}

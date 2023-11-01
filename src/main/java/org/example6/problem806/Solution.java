package org.example6.problem806;

public class Solution {

    public int[] numberOfLines(int[] widths, String s) {
        var sum = 0;
        var rows =1;
        for(int i=0; i< s.length(); ++i) {
            var symbol = s.charAt(i);
            sum += widths[symbol-'a'];
            if(sum > 100) {
                i--;
                sum =0;
                rows++;
            }
        }
        return new int[]{rows,sum};
    }
}

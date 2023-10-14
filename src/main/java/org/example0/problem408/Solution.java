package org.example0.problem408;

public class Solution {

    public boolean validWordAbbreviation(String word, String abbr) {
        if (abbr.charAt(0) == '0') {
            return false;
        }
        var curWordPos = word.length() - 1;
        var curAbbrPos = abbr.length() - 1;
        var shift = 0;
        var multiplicator = 1;
        var lastNumber = -1;
        var length = 0;
        while (curAbbrPos > - 1) {
            var abbrSymbol = abbr.charAt(curAbbrPos);
            int diff = abbrSymbol - '0';
            if (diff > -1 && diff < 10) {
                lastNumber = diff;
                shift += diff * multiplicator;
                length += diff * multiplicator;
                multiplicator *= 10;
            } else {
                length++;
                if(lastNumber == 0) {
                    return false;
                }
                curWordPos -= shift;
                if(curWordPos < 0) {
                    return false;
                }

                var wordSymbol = word.charAt(curWordPos);

                if (wordSymbol != abbrSymbol) {
                    return false;
                }
                shift = 1;
                multiplicator = 1;
            }
            curAbbrPos--;
        }
        return length == word.length();
    }
}

package org.example1.problem500;

import java.util.LinkedList;

public class Solution {

    public String[] findWords(String[] words) {
        var rows = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        var data = new byte['z' - 'a' + 1];
        for (int i = 0; i < rows.length; ++i) {
            String row = rows[i];
            for (int j = 0; j < row.length(); ++j) {
                var symbol = row.charAt(j);
                data[symbol - 'a'] = (byte) i;
            }
        }
        var result = new LinkedList<String>();
       mainLoop:  for (var word : words) {
            if (word.length() == 0) {
                continue;
            }
            int currentIndex = -1;
            for (int j = 0; j < word.length(); ++j) {
                var symbol = word.charAt(j);
                if (symbol > 64 && symbol < 91) {
                    symbol += 32;
                }
                var rowIndex = data[symbol - 'a'];
                if(currentIndex != -1 && rowIndex != currentIndex) {
                    continue mainLoop;
                }
                currentIndex = rowIndex;
            }
            result.add(word);
        }
        return result.toArray(new String[]{});
    }
}

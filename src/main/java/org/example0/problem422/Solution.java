package org.example0.problem422;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public boolean validWordSquare(List<String> words) {
        int maxLength = 0;
        for(String word : words) {
            if(maxLength < word.length()) {
                maxLength = word.length();
            }
        }

        int length = Math.max(maxLength, words.size());

        var data = new LinkedList<String>();
        var emptyBuilder = new StringBuilder();
        for(int i=0; i< length; ++i) {
            emptyBuilder.append(" ");
        }
        for(int i =0; i < length; ++i) {
            if(i < words.size()) {
                var word = words.get(i);
                var builder = new StringBuilder();
                if(word.length() < length) {
                    int emptySpaces = length - word.length();

                    for(int k =0; k < emptySpaces; ++k) {
                        builder.append(" ");
                    }

                }
                data.add(word + builder);
            } else {
                data.add(emptyBuilder.toString());
            }
        }


        for(int i=0; i < length; ++i) {
            var word = data.get(i);
            for(int k=0; k < length; ++k) {
                var symbolOne = word.charAt(k);
                var symbolTwo = data.get(k).charAt(i);
                if(symbolOne != symbolTwo) {
                    return false;
                }
            }
        }
        return true;
    }
}

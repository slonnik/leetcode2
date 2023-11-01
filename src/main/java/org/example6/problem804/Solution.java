package org.example6.problem804;

import java.util.HashSet;

public class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        var morseData = new String[] {
                ".-","-...","-.-.","-..",".","..-.","--.","....",
                "..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-",
                "-.--","--.."};
        var data = new HashSet<>();
        for(var word : words) {
            var builder = new StringBuilder();
            for(var i=0; i< word.length(); ++i) {
                var position = word.charAt(i) - 'a';
                builder.append(morseData[position]);
            }
            data.add(builder.toString());
        }
        return data.size();
    }

}

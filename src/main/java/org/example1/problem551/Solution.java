package org.example1.problem551;

public class Solution {

    public boolean checkRecord(String s) {
        short absence = 0;
        short late = 0;
        for (int i = 0; i < s.length(); ++i) {
            char symbol = s.charAt(i);
            if (symbol == 'L') {
                if(++late > 2) {
                    return false;
                }
            } else {
                late = 0;
                if (symbol == 'A') {
                    if(++absence > 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

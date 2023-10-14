package org.example4.problem693;

public class Solution {

    public boolean hasAlternatingBits(int n) {
        int result = n;
        int previous = -1;
        do {
            var reminder = result % 2;
            if(reminder == previous) {
                return false;
            }
            previous = reminder;
            result = result /2;
        } while(result != 0);
        return true;
    }
}

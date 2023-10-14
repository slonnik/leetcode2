package org.example1.problem507;

public class Solution {

    public boolean checkPerfectNumber(int num) {
        if (num < 2) {
            return false;
        }

        int end = num;
        int start = 2;
        int sum = 1;
        while(start < end) {
            if(num % start == 0) {
                end = num / start;
                sum += (start + end);
            }
            start++;
        }


        return sum == num;
    }
}

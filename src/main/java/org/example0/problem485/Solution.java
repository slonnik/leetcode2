package org.example0.problem485;

public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
        for (int number : nums) {
            if (number == 1) {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            } else {
                counter = 0;
            }
        }
        return max;
    }
}

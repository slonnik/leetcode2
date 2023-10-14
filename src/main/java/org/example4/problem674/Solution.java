package org.example4.problem674;

public class Solution {

    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int curLength = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i - 1]) {
               curLength++;
            } else {
                maxLength = Math.max(maxLength, curLength);
                curLength = 1;
            }
        }
        return Math.max(maxLength, curLength);
    }
}

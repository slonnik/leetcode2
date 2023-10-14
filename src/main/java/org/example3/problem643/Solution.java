package org.example3.problem643;

public class Solution {

    public double findMaxAverage(int[] nums, int k) {
        var length = nums.length;
        if (length == k) {
            var sum = 0L;
            for (int i = 0; i < length; ++i) {
                sum += nums[i];
            }
            return ((double) sum) / length;
        }

        var maxSum = 0L;
        var currSum = 0L;
        for (int i = 0; i < k; ++i) {
            currSum += nums[i];
        }
        maxSum = currSum;
        for(int i=1; i<= length -k; ++i) {
            currSum -= nums[i-1];
            currSum += nums[i+k-1];
            maxSum = Math.max(maxSum, currSum);
        }
        return (double) maxSum/k;
    }
}

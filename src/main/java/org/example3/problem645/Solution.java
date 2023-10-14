package org.example3.problem645;

import java.util.Arrays;

public class Solution {

    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        var length = nums.length;

        var result = new int[2];
        var expectedSum = (1 + length) * length / 2;
        var realSum = 0;
        for (int i = 0; i < length; ++i) {
            realSum += nums[i];
        }
        for (int i = 1; i < length; ++i) {
            if (nums[i] == nums[i-1]) {
                result[0] = nums[i];
            }
        }
        result[1] = result[0] + (expectedSum - realSum);
        return result;
    }
}

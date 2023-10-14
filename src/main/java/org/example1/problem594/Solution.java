package org.example1.problem594;

import java.util.Arrays;

public class Solution {

    public int findLHS(int[] nums) {
        int result = Integer.MIN_VALUE;
        int endPos = nums.length - 2;
        for (int i = 0; i < endPos; ++i) {
            int min = Math.min(nums[i], nums[i + 1]);
            int max = Math.max(nums[i], nums[i + 1]);
            for (int pos = i + 1; pos < nums.length; ++pos) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(nums, i, pos + 1)));
                if (min > nums[pos]) {
                    min = nums[pos];
                }
                if (max < nums[pos]) {
                    max = nums[pos];
                }
                if (Math.abs(max - min) == 1) {
                    result = Math.max(result, (pos - i) + 1);
                }
            }
        }

        return result;
    }
}

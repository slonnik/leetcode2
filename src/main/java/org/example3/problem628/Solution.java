package org.example3.problem628;

import java.util.Arrays;

public class Solution {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return Math.max(nums[length-1] * nums[length-2] * nums[length-3], nums[length-1] * nums[0] * nums[1]);

    }
}

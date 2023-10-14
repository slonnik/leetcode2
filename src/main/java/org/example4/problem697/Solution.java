package org.example4.problem697;

import java.util.HashMap;

public class Solution {

    public int findShortestSubArray(int[] nums) {
        var data = new HashMap<Integer, Integer>();
        for(int num : nums) {
            if(data.containsKey(num)) {
                var value = data.get(num);
                data.put(num, ++value);
            }else {
                data.put(num, 1);
            }
        }
        var maxValue = Integer.MIN_VALUE;
        for(var value : data.values()) {
            maxValue = Math.max(maxValue, value);
        }
        var minValue = Integer.MAX_VALUE;
        for(var entry : data.entrySet()) {
            if(entry.getValue() != maxValue) {
                continue;
            }
            minValue = Math.min(minValue, length(nums, entry.getKey()));
        }
        return minValue;
    }

    private int length(int[] nums, int value) {
        var start = 0;
        var end = nums.length -1;
        while(nums[start] != value || nums[end] != value) {
            if(nums[start] != value) {
                start++;
            }

            if(nums[end] != value) {
                end --;
            }
        }
        return end - start + 1;
    }
}

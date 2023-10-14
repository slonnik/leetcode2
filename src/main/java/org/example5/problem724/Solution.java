package org.example5.problem724;

public class Solution {

    public int pivotIndex(int[] nums) {
        var sum = 0L;
        for(var value : nums) {
            sum += value;
        }
        var index = 0;
        var leftSum = 0L;
        var rightSum = sum;
        while(index < nums.length) {
            if(index != 0) {
                leftSum+= nums[index-1];
            }
            rightSum-=nums[index];
            if(leftSum == rightSum) {
                return index;
            }
            index++;
        }
        return -1;
    }
}

package org.example0.problem414;

public class Solution {

    public int thirdMax(int[] nums) {
        long[] data = new long[] {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        start: for(int i=0; i < nums.length; ++i) {
            var value = nums[i];
            for(int k =0; k < data.length; ++k) {
                if(data[k] == value) {
                    continue start;
                }
            }
            if(data[0] < value) {
                data[2] = data[1];
                data[1] = data[0];
                data[0] = value;
            } else if(data[1] < value) {
                data[2] = data[1];
                data[1] = value;
            } else if(data[2] < value) {
                data[2] = value;
            }
        }
        if(data[2] == Long.MIN_VALUE) {
            return (int)data[0];
        }
        return (int)data[2];
    }
}
